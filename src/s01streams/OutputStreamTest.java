package s01streams;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("text.txt");

        int b = 37;
        os.write(b); // записывает в выходной поток один байт, который представлен целочисленным параметром b

        os.flush(); // очищает буфер вывода, записывая все его содержимое


        byte[] masBytes = new byte[] {32, 0, 15, 12};
        os.write(masBytes); // записывает в выходной поток массив байтов buffer.


        byte[] buffer = new byte[] {32, 0, 15, 12, 1, 7, 78, 4};
        int offset = 2;
        int length = 3;
        os.write(buffer, offset, length); // записывает в выходной поток некоторое число байтов, равное length,
                                          // из массива buffer, начиная со смещения offset, то есть с элемента buffer[offset].

        os.close(); // закрывает поток
    }
}
