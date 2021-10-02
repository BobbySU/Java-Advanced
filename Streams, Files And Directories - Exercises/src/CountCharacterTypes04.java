import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes04 {
    public static void main(String[] args) throws IOException {

        int countVowels = 0;
        int countConsonants = 0;
        int countPunctuation = 0;

        List<String> input = Files.readAllLines(Path.of("input.txt"));

        for (String line : input) {
            for (int i = 0; i < line.length(); i++) {
                int in = line.charAt(i);
                if (in != ' ') {
                    if (in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u') {
                        countVowels++;
                    } else if (in == ',' || in == '.' || in == '!' || in == '?') {
                        countPunctuation++;
                    } else {
                        countConsonants++;
                    }
                }
            }
        }
//        First way--->
        BufferedWriter writer = new BufferedWriter(new FileWriter("output4.txt"));
        writer.write("Vowels: " + countVowels);
        writer.newLine();
        writer.write("Consonants: " + countConsonants);
        writer.newLine();
        writer.write("Punctuation: " + countPunctuation);
        writer.newLine();
//        Secant way to Print--->
        PrintWriter printWriter = new PrintWriter("out4i.txt");
        printWriter.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d", countVowels, countConsonants, countPunctuation);

        writer.close();
        printWriter.close();
    }
}
