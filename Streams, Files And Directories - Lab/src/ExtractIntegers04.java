import java.io.*;
import java.util.Scanner;

public class ExtractIntegers04 {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        FileInputStream input = new FileInputStream(path);
        FileOutputStream out = new FileOutputStream("04.ExtractIntegersOutput.txt");
        PrintStream printOut = new PrintStream(out);
        Scanner scan = new Scanner(input);

        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                int num =scan.nextInt();
                printOut.println(num);
            }
            scan.next();
        }
        input.close();
        out.close();
    }
}
