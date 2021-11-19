package s01streams;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("file.txt");
        int bytes = is.available(); // возвращает количество байтов, доступных для чтения в потоке
        int oneByte = is.read();    // возвращает целочисленное представление следующего байта в потоке.
                                    // Когда в потоке не останется доступных для чтения байтов, данный метод возвратит число -1

        byte[] buffer = new byte[200];
        int byteCount = is.read(buffer); // считывает байты из потока в массив buffer.
                                         // После чтения возвращает число считанных байтов.
                                         // Если ни одного байта не было считано, то возвращается число -1

        int offset = 15;
        int length = 30;
        byteCount = is.read(buffer, offset, length); // считывает некоторое количество байтов, равное length, из потока в массив buffer.
                                                     // При этом считанные байты помещаются в массиве, начиная со смещения offset,
                                                     // то есть с элемента buffer[offset].
                                                     // Метод возвращает число успешно прочитанных байтов.

        int number = 18;
        long actualSkippedBytes = is.skip(number); // пропускает в потоке при чтении некоторое количество байт, которое равно number
        is.close(); // закрывает поток
    }
}
