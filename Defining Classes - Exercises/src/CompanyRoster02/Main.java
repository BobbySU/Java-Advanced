package CompanyRoster02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Employee> peoples = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            if (input.length == 4) {
                Employee employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3]);
                peoples.add(employee);
            } else if (input.length == 6) {
                Employee employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], input[4],
                        Integer.parseInt(input[5]));
                peoples.add(employee);
            } else {
                try {
                    int in = Integer.parseInt(input[4]);
                    Employee employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], "n/a", in);
                    peoples.add(employee);
                } catch (NumberFormatException e) {
                    String in = input[4];
                    Employee employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], in);
                    peoples.add(employee);
                }
            }
        }
        System.out.println("Highest Average Salary: Sales");
        peoples.forEach(e -> System.out.println(e.getName()));
    }
}
