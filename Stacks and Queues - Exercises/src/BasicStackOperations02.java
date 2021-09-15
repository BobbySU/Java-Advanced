import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] input = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);
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
            System.out.print("true");
        } else {
            System.out.print(stack.peek());
        }
    }
}
