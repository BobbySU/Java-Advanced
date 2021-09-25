import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        Set<Integer> one = new LinkedHashSet<>();
        Set<Integer> two = new LinkedHashSet<>();
        read(n, one, scan);
        read(m, two, scan);

        one.forEach(e -> {
            if (two.contains(e)) {
                System.out.print(e + " ");
            }
        });
//        Vtori nachin s retainAll -->
//        one.retainAll(two);
//        one.forEach(e->System.out.print(e + " "));
    }

    private static void read(int n, Set<Integer> one, Scanner scan) {
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            one.add(in);
        }
    }
}
