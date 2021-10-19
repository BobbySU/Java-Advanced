package GenericSwapMethodString03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> elements = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            elements.add(scan.nextLine());
        }
        int[] out = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        swapElements(elements, out);

        elements.stream().forEach(e -> System.out.println(e.getClass().getName() + ": " + e));
    }

    private static <T> void swapElements(List<T> list, int[] indexes) {
        T element = list.get(indexes[0]);
        list.set(indexes[0], list.get(indexes[1]));
        list.set(indexes[1], element);
    }
}
