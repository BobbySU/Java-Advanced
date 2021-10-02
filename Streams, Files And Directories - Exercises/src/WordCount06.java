import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount06 {
    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter("results.txt");
        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();

        String[] in = Files.readString(Path.of("words.txt")).split("\\s+");
        for (String e : in) {
            words.putIfAbsent(e, 0);
        }
        for (String e : Files.readAllLines(Path.of("text.txt"))) {
            Arrays.stream(e.split("\\s+")).forEach(el -> {
                if (words.containsKey(el)) {
                    words.put(el, words.get(el) + 1);
                }
            });
        }
        for (Map.Entry<String, Integer> word : words.entrySet()) {
            printWriter.println(word.getKey() + " - " + word.getValue());
        }
        printWriter.close();
    }
}
