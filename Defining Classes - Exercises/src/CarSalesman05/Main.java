package CarSalesman05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        Map<String, Engine> engines = new HashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input1 = scan.nextLine().split("\\s+");
            Engine engine;
            if (input1.length == 4) {
                engine = new Engine(input1[0], input1[1], input1[2], input1[3]);
            } else if (input1.length == 2) {
                engine = new Engine(input1[0], input1[1]);
            } else {
                try {
                    int in = Integer.parseInt(input1[2]);
                    engine = new Engine(input1[0], input1[1], input1[2], "n/a");
                } catch (NumberFormatException e) {
                    engine = new Engine(input1[0], input1[1], "n/a", input1[2]);
                }
            }
            engines.putIfAbsent(input1[0], engine);
        }

        int m = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < m; i++) {
            String[] input2 = scan.nextLine().split("\\s+");
            Engine carEngine = engines.get(input2[1]);
            Car car;
            if (input2.length == 4) {
                car = new Car(input2[0], carEngine, input2[2], input2[3]);
            } else if (input2.length == 2) {
                car = new Car(input2[0], carEngine);
            } else {
                try {
                    int in = Integer.parseInt(input2[2]);
                    car = new Car(input2[0], carEngine, input2[2], "n/a");
                } catch (NumberFormatException e) {
                    car = new Car(input2[0], carEngine, "n/a", input2[2]);
                }
            }
            cars.add(car);
        }
        cars.forEach(e -> System.out.print(e.toString()));
    }
}
