package CarSalesman05;

public class Engine {
    private String model;
    private String power;
    private String displacement;
    private String efficiency;

    public Engine(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, String power) {
        this(model, power, "n/a", "n/a");
    }

    @Override
    public String toString() {
        return String.format("%s:%nPower: %s%nDisplacement: %s%nEfficiency: %s",
                this.model, this.power, this.displacement, this.efficiency);
    }
}
