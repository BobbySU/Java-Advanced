import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> in = Arrays.stream(scan.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> evenNum = in.stream().filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        String out = evenNum.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(out);

        String out2 = evenNum.stream().sorted().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(out2);
    }
}
