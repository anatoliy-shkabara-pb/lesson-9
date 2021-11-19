package s03file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path testFilePath = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");

        Path fileName = testFilePath.getFileName();
        System.out.println(fileName);

        Path parent = testFilePath.getParent();
        System.out.println(parent);

        Path root = testFilePath.getRoot();
        System.out.println(root);

        // Обрати внимание на то, как работает метод endsWith().
        // Он проверяет, заканчивается ли текущий путь на переданный путь. Именно на путь, а не на набор символов.
        boolean endWithTxt = testFilePath.endsWith("Desktop\\testFile.txt");
        System.out.println("end with Desktop\\testFile.txt: " + endWithTxt);

        System.out.println("end with estFile.txt: " + testFilePath.endsWith("estFile.txt"));

        boolean startsWithLalala = testFilePath.startsWith("lalalala");
        System.out.println(startsWithLalala);


        // «нормализует» текущий путь, удаляя из него ненужные элементы.
        Path path5 = Paths.get("C:\\Users\\Java\\.\\examples");
        System.out.println(path5.normalize());

        Path path6 = Paths.get("C:\\Users\\Java\\..\\examples");
        System.out.println(path6.normalize());


        // вычисляет относительный путь между текущим и переданным путем.
        Path testFilePath1 = Paths.get("C:\\Users\\Users\\Users\\Users");
        Path testFilePath2 = Paths.get("C:\\Users\\Users\\Users\\Users\\Username\\Desktop\\testFile.txt");
        System.out.println(testFilePath1.relativize(testFilePath2));
    }
}
