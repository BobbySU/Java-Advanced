import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String in = scan.nextLine();

        Function<String, Integer> count = e -> e.split(", ").length;
        Function<String, Integer> sum = e -> Arrays.stream(e.split(", "))
                .mapToInt(Integer::parseInt).sum();

        System.out.println("Count = " + count.apply(in));
        System.out.println("Sum = " + sum.apply(in));

    }
}
