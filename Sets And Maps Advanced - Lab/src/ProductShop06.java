import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, List<String>> shops = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equals("Revision")) {
            String[] command = input.split(", ");
            if (!shops.containsKey(command[0])) {
                shops.put(command[0], new ArrayList<>());
                shops.get(command[0]).add(command[1] + " " + command[2]);
            } else {
                shops.get(command[0]).add(command[1] + " " + command[2]);
            }
            input = scan.nextLine();
        }
        shops.entrySet().stream().forEach(e -> {
            System.out.printf("%s->%n", e.getKey());
            e.getValue().forEach(el ->
                    System.out.printf("Product: %s, Price: %.1f%n",
                            el.split(" ")[0], Double.parseDouble(el.split(" ")[1])));
        });
    }
}
