import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers05 {
    public static void main(String[] args) throws IOException {

        List<String> input = Files.readAllLines(Path.of("inputLineNumbers.txt"));
        PrintWriter printWriter = new PrintWriter("output5.txt");
        int count = 1;
        for (String e : input) {
            printWriter.println(count + ". " + e);
            count++;
        }
        printWriter.close();
    }
}
