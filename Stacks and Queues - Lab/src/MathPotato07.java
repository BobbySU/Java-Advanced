import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String[] kids = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());

        for (String e : kids) {
            queue.offer(e);
        }
        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.printf("Removed %s%n", queue.poll());
            }
            cycle++;
        }
        System.out.printf("Last is %s%n", queue.poll());
    }

    private static boolean isPrime(int n) {
        boolean primeCheck = true;
        if (n == 0 || n == 1) {
            primeCheck = false;
            return primeCheck;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primeCheck = false;
                }
            }
            return primeCheck;
        }
    }
}