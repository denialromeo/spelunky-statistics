import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/** Allows reading from and writing to the Spelunky save file.
 *
 * @author Daniel Moore, http://danielmoore.us
 */
public class SpelunkySaveFile {
    /** Represents the Spelunky save file. */
    private RandomAccessFile fp;

    /** Constructor.
      *
      * @param  filename              The path to the Spelunky save file.
      * @throws FileNotFoundException From RandomAccessFile constructor.
      */
    public SpelunkySaveFile(String filename) throws FileNotFoundException {
        fp = new RandomAccessFile(filename, "rw");
    }

    /** Reads the stored value at a given byte position in the Spelunky save file.
      *
      * @param  bytePosition Treating the file as a byte array, the index to read the integer from.
      * @throws IOException  From RandomAccessFile.seek, skipBytes, read.
      * @return              The 4 bytes starting at the given position as an int.
      */
    public int readInt(int bytePosition) throws IOException {
        fp.seek(0);
        fp.skipBytes(bytePosition);
        byte[] b = new byte[Integer.BYTES];
        fp.read(b);
        return ByteBuffer.wrap(b).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }

    /** Writes a given integer to a given byte position in the Spelunky save file.
      *
      * @param  bytePosition Treating the file as a byte array, the index to write the integer to.
      * @param  value        The integer to write to the save file.
      * @throws IOException  From RandomAccessFile.seek, skipBytes, writeInt.
      */
    public void writeInt(int bytePosition, int value) throws IOException {
        fp.seek(0);
        fp.skipBytes(bytePosition);
        int littleEndianValue = ByteBuffer.wrap(new byte[Integer.BYTES]).putInt(0, value)
                               .order(ByteOrder.LITTLE_ENDIAN).getInt();
        fp.writeInt(littleEndianValue);
    }

    /** Closes the file-stream.
      *
      * @throws IOException From RandomAccessFile.close.
      */
    public void close() throws IOException {
        fp.close();
    }

    /** A simple demo. */
    public static void main(String[] argv) throws IOException {
        SpelunkySaveFile s = new SpelunkySaveFile("C:\\Program Files (x86)\\Steam\\SteamApps\\"
                                                + "common\\Spelunky\\Data\\spelunky_save.sav");
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