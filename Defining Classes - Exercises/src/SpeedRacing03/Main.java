package SpeedRacing03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Car> cars = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            Car car = new Car(input[0], Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            cars.put(input[0], car);
        }
        String command = scan.nextLine();
        while (!command.equals("End")) {
            String[] in = command.split(" ");
            if (in[0].equals("Drive")) {
                String carForDrive = in[1];
                int kmFofDrive = Integer.parseInt(in[2]);
                boolean drive = cars.get(carForDrive).drive(kmFofDrive);
                if (!drive) {
                    System.out.println("Insufficient fuel for the drive");
                }
            }
            command = scan.nextLine();
        }
        for (Map.Entry<String, Car> e : cars.entrySet()) {
            System.out.println(e.getValue().toString());
        }
    }
}
