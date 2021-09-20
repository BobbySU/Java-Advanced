import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int offerElement = scan.nextInt();
        int pollElement = scan.nextInt();
        int checkElement = scan.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < offerElement; i++) {
            queue.offer(scan.nextInt());
        }
        for (int i = 0; i < pollElement; i++) {
            queue.poll();
        }
        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(checkElement)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queue));
        }
    }
}
