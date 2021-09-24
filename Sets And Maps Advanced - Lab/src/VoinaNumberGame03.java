import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumberGame03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Integer> first = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> second = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        int runds = 50;
        while (runds-- > 0 && !first.isEmpty() && !second.isEmpty()) {
            Iterator<Integer> one = first.iterator();
            Iterator<Integer> two = second.iterator();
            int firstCard = one.next();
            one.remove();
            int secondCard = two.next();
            two.remove();

            if (firstCard > secondCard) {
                first.add(firstCard);
                first.add(secondCard);
            } else if (secondCard>firstCard){
                second.add(firstCard);
                second.add(secondCard);
            }
        }
        if (first.size() > second.size()) {
            System.out.println("First player win!");
        } else if (second.size() > first.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
