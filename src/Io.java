import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Io {
    public void io() throws IOException {
        BufferedInputStream in = new BufferedInputStream(System.in);
//        System.out.println("Masukkan angka = ");
        try {
            InputStream inputStream = new FileInputStream("Z:/name.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            int data = inputStream.read();
            char aChar = (char) data;
           while (data != -1) {
               System.out.print(aChar);
               data = inputStream.read();
           }
//            while (bufferedInputStream.available() > 0) {
//                char a = (char) bufferedInputStream.read();
//                System.out.print(a);
//            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
