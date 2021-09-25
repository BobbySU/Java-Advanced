import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<Character, Integer> chares = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char in = input.charAt(i);
            if (!chares.containsKey(in)) {
                chares.put(in, 1);
            } else {
                chares.put(in, chares.get(in) + 1);
            }
        }
        chares.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue() + " time/s"));
    }
}
