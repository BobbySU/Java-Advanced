import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char charBracket = input.charAt(i);
            if (charBracket == '[' || charBracket == '(' || charBracket == '{') {
                stack.push(charBracket);
            } else if (charBracket == ']' || charBracket == ')' || charBracket == '}') {
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                } else {
                    if ((stack.peek() == '[' && charBracket == ']') || (stack.peek() == '(' && charBracket == ')')
                            || (stack.peek() == '{' && charBracket == '}')) {
                        stack.pop();
                    } else {
                        break;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
