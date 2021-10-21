import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> names = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());

        Map<String, Predicate<String>> filters = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("Print")) {
            String[] data = input.split(";");
            String key = data[1] + " " + data[2];
            Predicate<String> predicate;

            if (data[0].equals("Add filter")) {
                switch (data[1]) {
                    case "Starts with":
                        predicate = text -> text.startsWith(data[2]);
                        filters.putIfAbsent(key, predicate);
                        break;
                    case "Ends with":
                        predicate = text -> text.endsWith(data[2]);
                        filters.putIfAbsent(key, predicate);
                        break;
                    case "Length":
                        predicate = text -> text.length() == Integer.parseInt(data[2]);
                        filters.putIfAbsent(key, predicate);
                        break;
                    case "Contains":
                        predicate = text -> text.contains(data[2]);
                        filters.putIfAbsent(key, predicate);
                        break;
                }
            } else {
                filters.remove(key);
            }
            input = scan.nextLine();
        }

        for (Map.Entry<String, Predicate<String>> kvp : filters.entrySet()) {
            for (int i = 0; i < names.size(); i++) {
                if (kvp.getValue().test(names.get(i))) {
                    names.remove(i);
                    i--;
                }
            }
        }
        System.out.println(names.toString().replaceAll("[\\[\\],]", ""));
    }
}
