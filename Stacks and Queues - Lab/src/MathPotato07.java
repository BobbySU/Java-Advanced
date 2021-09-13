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

        
    }
}