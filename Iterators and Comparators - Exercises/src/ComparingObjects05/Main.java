package ComparingObjects05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scan.nextLine();
        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            Person person = new Person(data[0], data[2], Integer.parseInt(data[1]));
            people.add(person);
            input = scan.nextLine();
        }
        Person person = people.get(Integer.parseInt(scan.nextLine()) - 1);
        int count = (int) people.stream().filter(e -> e.compareTo(person) == 0).count();

        if (count == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(String.format("%d %d %d", count, people.size() - count, people.size()));
        }
    }
}
