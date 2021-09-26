import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SrabskoUnleashed13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Integer>> place = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("End")) {
//            Lepa Brena @Sunny Beach 25 3500
            String[] in = input.split(" @");
            if (in.length == 2) {
                String singer = in[0];
                String[] placeAndPrice = in[1].split(" ");
                if (placeAndPrice.length >= 3 && placeAndPrice[placeAndPrice.length - 2].matches("\\d+")) {
                    int price = Integer.parseInt(placeAndPrice[placeAndPrice.length - 2]);
                    int guests = Integer.parseInt(placeAndPrice[placeAndPrice.length - 1]);
                    int sum = price * guests;
                    for (int i = placeAndPrice.length - 1; i >= placeAndPrice.length - 2; i--) {
                        placeAndPrice[i] = "";
                    }
                    String placeToAdd = "";
                    for (String s : placeAndPrice) {
                        placeToAdd += s + " ";
                    }
                    place.putIfAbsent(placeToAdd, new LinkedHashMap<>());
                    if (place.get(placeToAdd).containsKey(singer)) {
                        place.get(placeToAdd).put(singer, place.get(placeToAdd).get(singer) + sum);
                    }
                    place.get(placeToAdd).putIfAbsent(singer, sum);
                }
            }
            input = scan.nextLine();
        }
        place.entrySet().forEach(country -> {
            System.out.println(country.getKey());
            country.getValue().entrySet().stream()
                    .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())).forEach(singer ->
                    System.out.println("#  " + singer.getKey() + " -> " + singer.getValue())
            );
        });
    }
}
