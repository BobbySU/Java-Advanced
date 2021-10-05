import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] in = scan.nextLine().split("\\s+");

        Predicate<String> checkUpperCase = e -> Character.isUpperCase(e.charAt(0));

        List<String> upper = Arrays.stream(in).filter(checkUpperCase).collect(Collectors.toList());

        System.out.println(upper.size());
        System.out.println(String.join(System.lineSeparator(), upper));
    }
}