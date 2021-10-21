package StackIterator03;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CustomStack<Integer> customStack = new CustomStack<>();

        int[] data = Arrays.stream(scan.nextLine().split("([, ]+)")).skip(1).mapToInt(Integer::parseInt).toArray();

        Arrays.stream(data).forEach(customStack::push);

        String input = scan.nextLine();
        try {
            while (!input.equals("END")) {
                String[] com = input.split("\\s+");
                switch (com[0]) {
                    case "Pop":
                        customStack.pop();
                        break;
                    case "Push":
                        customStack.push(Integer.parseInt(com[1]));
                        break;
                }
                input = scan.nextLine();
            }

        } catch (NoSuchElementException e) {
            System.out.println("No elements");
        }
        customStack.forEach(System.out::println);
        customStack.forEach(System.out::println);
    }
}
