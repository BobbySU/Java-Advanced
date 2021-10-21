package LinkedListTraversal09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < n; i++) {
            String[] commandTokens = scan.nextLine().split("\\s+");
            String command = commandTokens[0];
            int value = Integer.parseInt(commandTokens[1]);

            switch (command) {
                case "Add":
                    linkedList.add(value);
                    break;
                case "Remove":
                    linkedList.remove(value);
                    break;
            }
        }

        System.out.println(linkedList.getSize());
        for (int value : linkedList) {
            System.out.print(value + " ");
        }
    }
}
