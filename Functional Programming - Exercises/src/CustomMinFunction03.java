import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Function <List<Integer>,Integer> function = e -> Collections.min(e);

        List<Integer> num = Arrays.stream(input.split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(function.apply(num));

//      Lesen na4in --->
//        System.out.println(Arrays.stream(input.split("\\s+"))
//                .mapToInt(Integer::parseInt).min().orElse(0));
    }
}
