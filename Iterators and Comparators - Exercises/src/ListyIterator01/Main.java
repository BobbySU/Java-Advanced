package ListyIterator01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> data = Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(e -> !e.equals("Create")).collect(Collectors.toList());

        ListyIterator listyIterator = new ListyIterator(data);

        String input = scan.nextLine();
        while (!input.equals("END")) {
            switch (input) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
            }
            input = scan.nextLine();
        }
    }
}

