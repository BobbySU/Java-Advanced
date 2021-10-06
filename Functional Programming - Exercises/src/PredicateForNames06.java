import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        String[] words = input.split(" ");

        Predicate<String> predicate = e -> e.length() <= n;

        Arrays.stream(words).filter(predicate).forEach(System.out::println);
    }
}