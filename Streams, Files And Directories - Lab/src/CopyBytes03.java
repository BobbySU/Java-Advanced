import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class CopyBytes03 {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";
        FileInputStream input = new FileInputStream(path);
        FileOutputStream out = new FileOutputStream("03.CopyBytesOutput.txt");
        PrintStream printOut = new PrintStream(out);
        int in = input.read();
        while (in != -1) {
            if (in != 10 && in != 32) {
                printOut.print(in);
            } else {
                printOut.print((char) in);
            }
            in = input.read();
        }
        input.close();
        out.close();
    }
}
