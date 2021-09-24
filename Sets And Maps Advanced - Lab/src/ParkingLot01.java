import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<String> num = new LinkedHashSet<>();

        String input = scan.nextLine();
        while (!input.equals("END")) {
            if (input.split(", ")[0].equals("IN")) {
                num.add(input.split(", ")[1]);
            } else if (input.split(", ")[0].equals("OUT")) {
                num.remove(input.split(", ")[1]);
            }
            input = scan.nextLine();
        }
        if (num.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String e : num) {
                System.out.println(e);
            }
        }
    }
}
