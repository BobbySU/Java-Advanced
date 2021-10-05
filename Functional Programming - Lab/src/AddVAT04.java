import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        UnaryOperator<Double> vat = e -> e * 1.20;

        System.out.println("Prices with VAT:");

        Arrays.stream(scan.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(vat)
                .forEach(e-> System.out.printf("%.2f%n",e));
    }
}
