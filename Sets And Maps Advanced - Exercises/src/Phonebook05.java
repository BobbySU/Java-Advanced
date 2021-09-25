import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> phone = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("search")) {
            String[] in = input.split("-");
            phone.putIfAbsent(in[0], in[1]);
            phone.put(in[0], in[1]);
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("stop")) {
            if (phone.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, phone.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
            input = scan.nextLine();
        }
    }
}
