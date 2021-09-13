import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        String input = scan.nextLine();
        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s%n", queue.peek());
                    queue.poll();
                }
            } else {
                queue.offer(input);
            }
            input = scan.nextLine();
        }
        for (String str : queue) {
            System.out.println(str);
        }
    }
}