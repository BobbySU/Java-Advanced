import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomComparator08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<Integer> num = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt).sorted().collect(Collectors.toList());

        Comparator<Integer> comparator = ((first, second) -> {
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            } else {
                return first.compareTo(second);
            }
        });
        num.stream().sorted(comparator).forEach(number -> System.out.print(number + " "));

//        My way---->
//        Predicate<Integer> predicate = e -> e % 2 == 0;
//        Predicate<Integer> predicate2 = e -> e % 2 != 0;
//
//        System.out.print(num.stream().filter(predicate).map(String::valueOf)
//                .collect(Collectors.joining(" ")));
//        System.out.print(" ");
//        System.out.print(num.stream().filter(predicate2).map(String::valueOf)
//                .collect(Collectors.joining(" ")));
    }
}
