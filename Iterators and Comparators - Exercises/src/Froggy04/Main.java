package Froggy04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> output = new ArrayList<>();

        if (scan.nextLine().equals("END")) {
            Lake lake = new Lake(input);
            int index = 0;
            List<Integer> odd = new ArrayList<>();
            for (Integer num : lake) {
                if (index++ % 2 == 0) {
                    output.add(num);
                } else {
                    odd.add(num);
                }
            }
            output.addAll(odd);
        }
        System.out.println(output.toString().replaceAll("[\\[\\]]", ""));
    }
}
