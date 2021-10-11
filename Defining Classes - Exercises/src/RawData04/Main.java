package RawData04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            Car car = new Car(input[0], new Engine(Integer.parseInt(input[1]), Integer.parseInt(input[2])),
                    new Cargo(Integer.parseInt(input[3]), input[4]),
                    new Tires(Double.parseDouble(input[5]), Integer.parseInt(input[6]),
                            Double.parseDouble(input[7]), Integer.parseInt(input[8]),
                            Double.parseDouble(input[9]), Integer.parseInt(input[10]),
                            Double.parseDouble(input[11]), Integer.parseInt(input[12])));
            cars.add(car);
        }
        String command = scan.nextLine();
        if (command.equals("fragile")) {
            cars.stream().filter(e -> e.getCargo().getCargoType().equals("fragile"))
                    .filter(e->e.getTires().tireCheck())
                    .forEach(e -> System.out.println(e.getModel()));
        } else if (command.equals("flamable")) {
            cars.stream().filter(e -> e.getCargo().getCargoType().equals("flamable"))
                    .filter(e -> e.getEngine().getEnginePower() > 250)
                    .forEach(e -> System.out.println(e.getModel()));
        }
    }
}
