package Threeuple11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] data = scan.nextLine().split("\\s+");

        Threeuple<String, String, String> nameAddressTown = new Threeuple<>(data[0] + " " + data[1], data[2], data[3]);

        System.out.println(nameAddressTown);

        data = scan.nextLine().split("\\s+");

        Threeuple<String, Integer, Boolean> nameLiterBeerDrunk;

        if (data[2].equals("drunk")) {
            nameLiterBeerDrunk = new Threeuple<>(data[0], Integer.parseInt(data[1]), true);
        } else {
            nameLiterBeerDrunk = new Threeuple<>(data[0], Integer.parseInt(data[1]), false);
        }

        System.out.println(nameLiterBeerDrunk);

        data = scan.nextLine().split("\\s+");

        Threeuple<String, Double, String> nameBalanceBank = new Threeuple<>(data[0], Double.parseDouble(data[1]), data[2]);

        System.out.println(nameBalanceBank);
    }
}
