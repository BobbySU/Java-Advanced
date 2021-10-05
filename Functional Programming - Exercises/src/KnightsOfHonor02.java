import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Consumer<String> consumer = e -> System.out.println("Sir " + e);

        String input = scan.nextLine();
        Arrays.stream(input.split("\\s+")).forEach(consumer);
    }
}
