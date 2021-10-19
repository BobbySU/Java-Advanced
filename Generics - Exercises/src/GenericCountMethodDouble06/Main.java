package GenericCountMethodDouble06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Double> elements = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            elements.add(Double.parseDouble(scan.nextLine()));
        }

        double out = Double.parseDouble(scan.nextLine());

        System.out.println(getCount(elements, out));
    }

    private static <T extends Comparable<T>> int getCount(List<T> list, T compareParameter) {
        return (int) list.stream().filter(e -> e.compareTo(compareParameter) > 0).count();
    }
}
