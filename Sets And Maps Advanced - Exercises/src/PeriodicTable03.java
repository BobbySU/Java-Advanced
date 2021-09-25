import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> element = new TreeSet<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] in = scan.nextLine().split(" ");
            for (int j = 0; j < in.length; j++) {
                element.add(in[j]);
            }
        }
        element.forEach(e -> System.out.print(e + " "));
    }
}
