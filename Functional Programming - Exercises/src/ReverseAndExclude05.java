import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Integer> num = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scan.nextLine());

        Collections.reverse(num);

        Predicate<Integer> predicate = e -> e % n != 0;

        System.out.println(num.stream().filter(predicate).map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
