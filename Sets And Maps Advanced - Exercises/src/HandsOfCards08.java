import java.util.*;

public class HandsOfCards08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Set<String>> people = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("JOKER")) {
            String[] in = input.split(": ");
            String name = in[0];
            String[] cards = in[1].split(", ");
            people.putIfAbsent(name, new LinkedHashSet<>());
            for (String e : cards) {
                people.get(name).add(e);
            }
            input = scan.nextLine();
        }
        people.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + checkSum(e, getValue())));
    }

    private static int checkSum(Map.Entry<String, Set<String>> e, Map<Character, Integer> value) {
        int sum = 0;
        for (String el : e.getValue()) {
            if (el.length() == 2) {
                char one = el.charAt(0);
                char two = el.charAt(1);
                int score = value.get(one) * value.get(two);
                sum += score;
            } else {
                char two = el.charAt(2);
                int score = 10 * value.get(two);
                sum += score;
            }
        }
        return sum;
    }

    private static Map<Character, Integer> getValue() {
        Map<Character, Integer> points = new HashMap<>();
        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 8);
        points.put('9', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);
        return points;
    }
}