import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class allCapitals03 {
    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        Files.readAllLines(Path.of("input.txt")).forEach(line -> {
            try {
                writer.write(line.toUpperCase());
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
    }
}
