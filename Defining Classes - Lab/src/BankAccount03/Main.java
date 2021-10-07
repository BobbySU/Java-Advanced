package BankAccount03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Integer, BankAccount> people = new HashMap<>();

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] in = input.split("\\s+");
            switch (in[0]) {
                case "Create":
                    BankAccount account = new BankAccount();
                    people.put(account.getId(), account);
                    System.out.printf("Account ID%d created%n", account.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(in[1]);
                    int amount = Integer.parseInt(in[2]);
                    if (!people.containsKey(id)) {
                        System.out.println("Account does not exist");
                    } else {
                        people.get(id).deposit(amount);
                        System.out.printf("Deposited %d to ID%d%n", amount, id);
                    }
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(in[1]));
                    break;
                case "GetInterest":
                    id = Integer.parseInt(in[1]);
                    int years = Integer.parseInt(in[2]);
                    if (!people.containsKey(id)) {
                        System.out.println("Account does not exist");
                    } else {
                        double interest = people.get(id).getInterest(years);
                        System.out.printf("%.2f%n", interest);
                    }
                    break;
            }
            input = scan.nextLine();
        }
    }
}
