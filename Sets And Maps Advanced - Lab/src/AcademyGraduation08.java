import java.util.*;

public class AcademyGraduation08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> people = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String student = scan.nextLine();
            String[] input = scan.nextLine().split(" ");
            people.putIfAbsent(student, new ArrayList<>());
            for (int j = 0; j < input.length; j++) {
                people.get(student).add(Double.parseDouble(input[j]));
            }
        }
        people.entrySet().stream().forEach(e -> {
            System.out.printf("%s is graduated with ", e.getKey());
            double sum = 0;
            for (double el : e.getValue()) {
                sum += el;
            }
            sum = sum / e.getValue().size();
            System.out.println(sum);
        });
    }
}
