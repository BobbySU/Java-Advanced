package StrategyPattern06;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeSet<Person> peoples = new TreeSet<>(new CompareNames());
        TreeSet<Person> people2 = new TreeSet<>(new CompareAges());

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split("\\s+");
            Person person = new Person(data[0], Integer.parseInt(data[1]));
            peoples.add(person);
            people2.add(person);
        }
        peoples.forEach(System.out::println);
        people2.forEach(System.out::println);
    }
}
