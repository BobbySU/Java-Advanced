import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> url = new ArrayDeque<>();

        String input = scan.nextLine();

        String forward = "";
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (url.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    forward = url.peek();
                    url.pop();
                    System.out.println(url.peek());
                }
            } else if (input.equals("forward")) {
                if (forward.equals("")) {
                    System.out.println("no next URLs");
                } else {
                    url.push(forward);
                    System.out.println(forward);
                    forward = "";
                }
            } else {
                url.push(input);
                System.out.println(input);
                forward = "";
            }
            input = scan.nextLine();
        }
    }
}
