import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Function<int[], int[]> add = e -> Arrays.stream(e).map(n -> n += 1).toArray();
        Function<int[], int[]> sub = e -> Arrays.stream(e).map(n -> n -= 1).toArray();
        Function<int[], int[]> mul = e -> Arrays.stream(e).map(n -> n *= 2).toArray();
        Consumer<int[]> print = e -> Arrays.stream(e).forEach(n -> System.out.print(n + " "));

        String command = scan.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "print":
                    print.accept(num);
                    System.out.println();
                    break;
                case "add":
                    num = add.apply(num);
                    break;
                case "subtract":
                    num = sub.apply(num);
                    break;
                case "multiply":
                    num = mul.apply(num);
                    break;
            }
            command = scan.nextLine();
        }
    }
}
