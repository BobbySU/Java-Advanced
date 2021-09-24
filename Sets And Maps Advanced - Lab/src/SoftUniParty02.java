import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeSet<String> num = new TreeSet<>();

        String input = scan.nextLine();
        while (!input.equals("PARTY")) {
            num.add(input);
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("END")) {
            num.remove(input);
            input = scan.nextLine();
        }
        System.out.println(num.size());
        for (String e : num) {
            System.out.println(e);
        }
    }
}
