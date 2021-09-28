import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile02 {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";
        FileInputStream input = new FileInputStream(path);
        Set<Character> element = Set.of(',', '.', '!', '?');

        int in = input.read();
        while (in != -1) {
            char lather = (char) in;
            if (!element.contains(lather)) {
                System.out.print(lather);
            }
            in = input.read();
        }
    }
}
