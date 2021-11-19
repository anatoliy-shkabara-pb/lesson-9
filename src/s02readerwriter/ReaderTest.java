package s02readerwriter;

import java.io.FileReader;
import java.io.Reader;

public class ReaderTest {
    public static void main(String[] args) {
        // Creates an array of character
        char[] array = new char[100];

        // Creates a reader using the FileReader
        try (Reader reader = new FileReader("files/s02-reader.txt")) {

            // Checks if reader is ready
            System.out.println("Is there data in the stream?  " + reader.ready());

            // Reads characters
            reader.read(array);
            System.out.println("Data in the stream:");
            System.out.println(array);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
