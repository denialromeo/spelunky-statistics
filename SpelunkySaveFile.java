import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

/**
 * Allows reading from and writing to the Spelunky save file.
 * @author Daniel Moore, http://danielmoore.us
 */
public class SpelunkySaveFile {
	private RandomAccessFile fp;

	public SpelunkySaveFile(String filename) throws IOException {
		if (!(new File(filename)).exists()) {
			throw new FileNotFoundException("File " + filename + " does not exist!");
		}
		fp = new RandomAccessFile(filename, "rw");
	}

	/** Given a byte position in the file, reads, re-orders, and returns a 4-byte integer.*/
	public int readInt(int byte_position) throws IOException {
		fp.seek(0);
		fp.skipBytes(byte_position);
		byte[] b = new byte[4];
		fp.read(b);
		return ByteBuffer.wrap(b).order(ByteOrder.LITTLE_ENDIAN).getInt();
	}

	/** Given a byte position in the file and an int, re-orders the int and writes it to 
	    that position in the file.*/
	public void writeInt(int byte_position, int value) throws IOException {
		fp.seek(0);
		fp.skipBytes(byte_position);
		int reorderedValue = ByteBuffer.wrap(new byte[4]).putInt(0, value)
		      				.order(ByteOrder.LITTLE_ENDIAN).getInt();
		fp.writeInt(reorderedValue);
	}

	public void close() throws IOException {
		fp.close();
	}

	public static void main(String[] argv) throws IOException {
		SpelunkySaveFile s = new SpelunkySaveFile("spelunky_save.sav");
		if (argv.length > 1) {
			int byte_position = Integer.parseInt(argv[0]);
			int value = Integer.parseInt(argv[1]);
			s.writeInt(byte_position, value);
		}
		else if (argv.length == 1) {
			int byte_position = Integer.parseInt(argv[0]);
			System.out.println(s.readInt(byte_position));
		}
		s.close();
	}
}