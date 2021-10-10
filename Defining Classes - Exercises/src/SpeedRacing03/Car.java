package SpeedRacing03;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private int traveled;

    public Car(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.traveled = 0;
    }

    public boolean drive(double km) {
        double fueledRequired = km * fuelCost;
        if (fueledRequired > this.fuelAmount) {
            return false;
        } else {
            this.fuelAmount -= fueledRequired;
            this.traveled += km;
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.traveled);
    }
}
