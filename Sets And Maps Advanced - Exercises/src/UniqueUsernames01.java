import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Set<String> name = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            name.add(input);
        }
        name.forEach(System.out::println);
    }
}
