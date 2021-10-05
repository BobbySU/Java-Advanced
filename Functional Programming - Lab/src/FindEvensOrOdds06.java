import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvensOrOdds06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] range = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String command = scan.nextLine();

        printNum(range[0], range[1],
                command.equals("even")
                        ? n -> n % 2 == 0
                        : n -> n % 2 != 0);
    }

    private static void printNum(int start, int stop, Predicate<Integer> predicate) {
        System.out.println(IntStream.rangeClosed(start, stop)
                .boxed().filter(predicate).map(String::valueOf).collect(Collectors.joining(" "))
        );
    }
}
