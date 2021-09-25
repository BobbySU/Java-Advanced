import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> mine = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("stop")) {
            int num = Integer.parseInt(scan.nextLine());
            if (!mine.containsKey(input)) {
                mine.putIfAbsent(input, num);
            } else {
                mine.put(input, mine.get(input) + num);
            }
            input = scan.nextLine();
        }
        mine.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
