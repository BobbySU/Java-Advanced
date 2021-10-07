import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> people = Arrays.stream(scan.nextLine().split(" "))
                .collect(Collectors.toCollection(ArrayList::new));

        String command = scan.nextLine();
        while (!command.equals("Party!")) {

            Predicate<String> predicate = null;

            String in = command.split("\\s+")[2];

            if (command.contains("Length")) {
                predicate = x -> x.length() == Integer.parseInt(in);
            } else if (command.contains("StartsWith")) {
                predicate = x -> x.startsWith(in);
            } else {
                predicate = x -> x.endsWith(in);
            }

            if (command.contains("Remove")) {
                ArrayList<String> toRemove = new ArrayList<>();
                for (String guest : people) {
                    if (predicate.test(guest)) {
                        toRemove.add(guest);
                    }
                }
                people.removeAll(toRemove);
            } else {
                ArrayList<String> toAdd = new ArrayList<>();
                for (String guest : people) {
                    if (predicate.test(guest)) {
                        toAdd.add(guest);
                    }
                }
                people.addAll(toAdd);
            }
            command = scan.nextLine();
        }

        if (people.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(people.stream().sorted().collect(Collectors.toCollection(ArrayList::new))
                    .toString().replaceAll("([\\[\\]])", "") + " are going to the party!");
        }
    }
}
