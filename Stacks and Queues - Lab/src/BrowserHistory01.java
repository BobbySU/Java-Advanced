import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> url = new ArrayDeque<>();

        String input = scan.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (url.size()==1) {
                    System.out.println("no previous URLs");
                } else {
                    System.out.println(url.peek());
                }
            } else {
                url.push(input);
                System.out.println(input);
            }
            input = scan.nextLine();
        }
    }
}
