import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] num = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> number = new LinkedHashMap<>();

        for (Double e : num) {
            if (number.containsKey(e)) {
                number.put(e, number.get(e) + 1);
            } else {
                number.put(e, 1);
            }
        }
        number.entrySet().forEach(e -> System.out.printf("%.1f -> %d%n", e.getKey(), e.getValue()));
    }
}
