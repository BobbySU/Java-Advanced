import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        String output = num.isEmpty()
                ?"Parking Lot is Empty":
                num.stream().collect(Collectors.joining(System.lineSeparator()));
        System.out.println(output);
//        Vtori Nachin za otpechatvane---->
//        if (num.isEmpty()) {
//            System.out.println("Parking Lot is Empty");
//        } else {
//            for (String e : num) {
//                System.out.println(e);
//            }
//        }
    }
}
