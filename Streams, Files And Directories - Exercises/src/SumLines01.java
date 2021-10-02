import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines01 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("input.txt");

        List<String> allLines = Files.readAllLines(path);

        for (String e : allLines) {
            int sum = 0;
            for (int i = 0; i < e.length(); i++) {
                char in = e.charAt(i);
                sum += in;
            }
            System.out.println(sum);
        }
//        Vtori nachin ---->
//        String paths = "input.txt";
//        Files.readAllLines(Path.of(paths)).stream()
//                .map(String :: toCharArray)
//                .forEach(charArray ->
//                {
//                    int sum = 0;
//                    for (char symbol : charArray) {
//                        sum += symbol;
//                    }
//                    System.out.println(sum);
//                });
    }
}
