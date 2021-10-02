import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;

public class MergeTwoFiles07 {
    public static void main(String[] args) throws IOException {

        Set<Integer> num = new TreeSet<>();
        Files.readAllLines(Paths.get("inputOne.txt")).forEach(e -> num.add(Integer.parseInt(e)));
        Files.readAllLines(Path.of("inputTwo.txt")).forEach(e -> {
            if (!num.contains(Integer.parseInt(e))){
                num.add(Integer.parseInt(e));
            }
        });
        PrintWriter printWriter =new PrintWriter("output7.txt");
        for (Integer e:num) {
            printWriter.println(e);
        }
        printWriter.close();
    }
}
