import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes03 {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";
        FileInputStream input = new FileInputStream(path);
        FileOutputStream out = new FileOutputStream("out3.txt");

        int in = input.read();
        while (in != -1) {
            if (in != 10 && in != 32) {
                System.out.print(in);
            } else {
                System.out.print((char) in);
            }
            in = input.read();
        }
        input.close();
        out.close();
    }
}
