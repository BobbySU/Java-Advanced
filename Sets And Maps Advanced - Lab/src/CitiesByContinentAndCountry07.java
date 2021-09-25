import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class CitiesByContinentAndCountry07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, List<String>>> continents = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            continents.putIfAbsent(input[0], new LinkedHashMap<>());
            continents.get(input[0]).putIfAbsent(input[1], new ArrayList<>());
            continents.get(input[0]).get(input[1]).add(input[2]);
        }
        continents.entrySet().stream().forEach(continent -> {
            System.out.printf("%s:%n", continent.getKey());
            continent.getValue().entrySet().stream().forEach(country -> {
                System.out.println("  "+country.getKey()+" -> "+String.join(", ",country.getValue()));
//                Variant s replace --->
//                System.out.printf("  %s -> ", country.getKey());
//                System.out.printf("%s", country.getValue().toString().
//                        replace("]", "").replace("[", ""));
//                System.out.println();
            });
        });
    }
}
