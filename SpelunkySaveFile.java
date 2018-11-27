import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * SpelunkySaveFile Object.
 *
 * <P>Allows reading from and writing to the Spelunky save file.
 *
 * @author Daniel Moore, http://danielmoore.us
 */
public class SpelunkySaveFile {
    /** Represents the Spelunky save file. */
    private RandomAccessFile fp;

    /** Constructor.
      *
      * @param  filename    The path to the Spelunky save file (should be named spelunky_save.sav).
      * @throws IOException If given file-path doesn't exist.
      */
    public SpelunkySaveFile(String filename) throws IOException {
        if (!(new File(filename)).exists()) {
            throw new FileNotFoundException("File " + filename + " does not exist!");
        }
        fp = new RandomAccessFile(filename, "rw");
    }

    /** Reads the stored value at a given byte position in the Spelunky save file.
      *
      * @param  bytePosition Treating the file as a byte array, the index to read the integer from.
      * @return              The 32-bit integer at the given index.
      */
    public int readInt(int bytePosition) throws IOException {
        fp.seek(0);
        fp.skipBytes(bytePosition);
        byte[] b = new byte[4];
        fp.read(b);
        return ByteBuffer.wrap(b).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }

    /** Writes a given integer to a given byte position in the Spelunky save file.
      *
      * @param  bytePosition Treating the file as a byte array, the index to write the integer to.
      * @param  value        The integer to write to the save file.
      * @throws IOException
      */
    public void writeInt(int bytePosition, int value) throws IOException {
        fp.seek(0);
        fp.skipBytes(bytePosition);
        int reorderedValue = ByteBuffer.wrap(new byte[4]).putInt(0, value).order(ByteOrder.LITTLE_ENDIAN).getInt();
        fp.writeInt(reorderedValue);
    }

    /** Closes the file-stream.
      * @throws IOException
      */
    public void close() throws IOException {
        fp.close();
    }

    /** A simple demo. */
    public static void main(String[] argv) throws IOException {
        SpelunkySaveFile s = new SpelunkySaveFile("spelunky_save.sav");
        if (argv.length > 1) {
            int bytePosition = Integer.parseInt(argv[0]);
            int value = Integer.parseInt(argv[1]);
            s.writeInt(bytePosition, value);
        }
        else if (argv.length == 1) {
            int bytePosition = Integer.parseInt(argv[0]);
            System.out.println(s.readInt(bytePosition));
        }
        s.close();
    }
}