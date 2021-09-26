import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> mail = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("stop")) {
            String in = scan.nextLine();
            if (!in.endsWith("us") && !in.endsWith("uk") && !in.endsWith("com")) {
                mail.put(input, in);
            }
            input = scan.nextLine();
        }
        mail.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
