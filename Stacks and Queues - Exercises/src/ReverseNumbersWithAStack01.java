import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithAStack01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(e -> stack.push(Integer.parseInt(e)));

        for (Integer e : stack) {
            System.out.print(stack.pop() + " ");
        }
    }
}
