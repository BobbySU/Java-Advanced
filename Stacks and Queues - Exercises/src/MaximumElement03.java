import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] command = scan.nextLine().split("\\s+");
            switch (command[0]) {
                case "1":
                    int num = Integer.parseInt(command[1]);
                    stack.push(num);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    if (!stack.isEmpty()) {
                        System.out.println(Collections.max(stack));
                    }
                    break;
            }
        }
    }
}
