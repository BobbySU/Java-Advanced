package CarSalesman05;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this(model, engine, "n/a", "n/a");
    }

    @Override
    public String toString() {

        return String.format("%s:%n%s%nWeight: %s%nColor: %s%n",
                this.model, this.engine, this.weight, this.color);
    }
}
