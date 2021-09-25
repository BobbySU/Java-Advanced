import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        TreeMap<String, ArrayList<Double>> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            if (!students.containsKey(input[0])) {
                students.put(input[0], new ArrayList<>());
                students.get(input[0]).add(Double.parseDouble(input[1]));
            } else {
                students.get(input[0]).add(Double.parseDouble(input[1]));
            }
        }
        students.entrySet().forEach(e -> {
            System.out.printf("%s ->", e.getKey());
            e.getValue().stream().forEach(index -> System.out.printf(" %.2f", index));
            double sum = 0;
            for (double el : e.getValue()) {
                sum += el;
            }
            sum = sum / e.getValue().size();
            System.out.printf(" (avg: %.2f)%n", sum);
        });
    }
}