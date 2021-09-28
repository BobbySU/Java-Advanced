import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile01 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String path = "input.txt";
        try {
            FileInputStream in = new FileInputStream(path);

            int var = in.read();
            while (var != -1) {
                System.out.print(Integer.toBinaryString(var) + " ");
                var = in.read();

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}