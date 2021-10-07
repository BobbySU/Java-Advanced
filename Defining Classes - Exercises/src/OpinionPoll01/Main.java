package OpinionPoll01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> peoples = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            peoples.add(person);
        }
        peoples.stream().filter(e -> e.getAge() > 30).sorted(Comparator.comparing(Person::getName))
                .forEach(e -> System.out.println(e.getName() + " - " + e.getAge()));
    }
}
