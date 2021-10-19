package CustomListIterator09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CustomList<String> list = new CustomList<>();

        String input = scan.nextLine();
        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            switch (data[0]) {
                case "Add":
                    list.add(data[1]);
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(data[1]));
                    break;
                case "Contains":
                    System.out.println(list.contains(data[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(data[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    for (String e:list) {
                        System.out.println(e);
                    }
                    break;
                case "Sort":
                    Sorter.sort(list);
                    break;
            }
            input = scan.nextLine();
        }
    }
}
