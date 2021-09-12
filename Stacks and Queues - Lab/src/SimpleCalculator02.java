import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculator02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        Deque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, input);

        while (stack.size() > 1) {
            int first = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int second = Integer.parseInt(stack.pop());

            int result = operator.equals("+")
                    ? first + second
                    : first - second;
            stack.push(String.valueOf(result));
        }
        System.out.println(stack.pop());
    }
}

