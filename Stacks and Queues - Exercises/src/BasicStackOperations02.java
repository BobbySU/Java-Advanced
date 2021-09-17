import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = scan.nextInt();
        int s = scan.nextInt();
        int x = scan.nextInt();

        String[] number = scan.nextLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(number[i]));
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}
