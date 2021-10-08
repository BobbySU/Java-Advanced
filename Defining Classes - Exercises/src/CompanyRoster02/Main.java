package CompanyRoster02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Department> departmentMap = new HashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            Employee employee = null;
            if (input.length == 4) {
                employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3]);
            } else if (input.length == 6) {
                employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], input[4],
                        Integer.parseInt(input[5]));
            } else {
                try {
                    int in = Integer.parseInt(input[4]);
                    employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], "n/a", in);
                } catch (NumberFormatException e) {
                    String in = input[4];
                    employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], in);
                }
            }
            departmentMap.putIfAbsent(input[3], new Department(input[3]));
            departmentMap.get(input[3]).getEmployee().add(employee);
        }
        Department departmentForPrint = departmentMap.entrySet()
                .stream()
                .max(Comparator.comparing(e -> e.getValue().calculateAverage()))
                .get()
                .getValue();
        System.out.printf("Highest Average Salary: %s%n", departmentForPrint.getName());

        departmentForPrint.getEmployee().stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(e -> System.out.print(e.toString()));
    }
}
