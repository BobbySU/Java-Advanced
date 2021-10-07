package CarInfo01;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public void printCar(){
        System.out.printf("The car is: %s %s - %d HP.%n",this.brand,this.model,this.horsePower);
    }
}
