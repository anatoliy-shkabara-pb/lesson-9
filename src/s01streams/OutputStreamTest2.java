package s01streams;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest2 {
    public static void main(String[] args) {
        String data = "This is a line of text inside the file.";
        OutputStream os = null;
        try {
            os = new FileOutputStream("files/s01-output-text.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            os.write(dataBytes);
            System.out.println("Data is written to the file.");
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
