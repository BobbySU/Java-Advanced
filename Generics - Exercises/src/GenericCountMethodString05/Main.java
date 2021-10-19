package GenericCountMethodString05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<String> elements = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            elements.add(scan.nextLine());
        }

        String out = scan.nextLine();

        System.out.println(getCount(elements, out));
    }

    private static <T extends Comparable<T>> int getCount(List<T> list, T compareParameter) {
        return (int) list.stream().filter(e -> e.compareTo(compareParameter) > 0).count();
    }
}
