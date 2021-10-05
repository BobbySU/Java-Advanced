import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEvenNumbers01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> in = Arrays.stream(scan.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> evenNum = in.stream().filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        Function<Stream<Integer>,String> mutator = a->a.map(String::valueOf).collect(Collectors.joining(", "));

        String out = mutator.apply(evenNum.stream());
        System.out.println(out);

        String out2 = mutator.apply(evenNum.stream().sorted());
        System.out.println(out2);
    }
}
