package s03file;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesTest2 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("files/s02-reader.txt");

        // чтение всех строк файла
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        for (String s: lines) {
            System.out.println(s);
        }
    }
}
