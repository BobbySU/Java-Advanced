import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String[] kids = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());

        for (String e : kids) {
            queue.offer(e);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            System.out.printf("Removed %s%n", queue.poll());
        }
        System.out.printf("Last is %s%n", queue.poll());
    }
}
