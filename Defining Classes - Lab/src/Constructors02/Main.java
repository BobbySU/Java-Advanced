package Constructors02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            if (input.length==1){
                Car car= new Car(input[0]);
                car.printCar();
            }else {
                Car car = new Car(input[0], input[1], Integer.parseInt(input[2]));
                car.printCar();
            }
        }
    }
}
