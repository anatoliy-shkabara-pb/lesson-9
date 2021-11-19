package s05readwritefile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWriteFileTest {
    public static void main(String[] args) {

        Path path = Paths.get("files/s05-data.txt");

        // write to file
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Some test 123");
            writer.newLine();
            writer.write("Other string 456");
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");


        // read from file
        System.out.println("Read text from file \"" + path.toAbsolutePath() + "\":");
        try (BufferedReader reader = Files.newBufferedReader(path)) {

            System.out.println("----------------------------------");
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("----------------------------------");

        } catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }
        System.out.println("Read from file done!");
    }
}
