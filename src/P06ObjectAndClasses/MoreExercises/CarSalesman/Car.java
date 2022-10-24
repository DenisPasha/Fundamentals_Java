package P06ObjectAndClasses.MoreExercises.CarSalesman;

public class Car {
    String model;
    String carWeight;
    String carColour;
    Engine engine;

    public Car(String model, String carWeight, String carColour, Engine engine) {
        this.model = model;
        this.carWeight = carWeight;
        this.carColour = carColour;
        this.engine = engine;
    }

    public String toString(){
        return String.format("%s:\n" +
                "  %s:\n" +
                "    Power: %s\n" +
                "    Displacement: %s\n" +
                "    Efficiency: %s\n" +
                "  Weight: %s\n" +
                "  Color: %s",model,engine.model,engine.power,engine.displacement,engine.efficiency,carWeight,carColour);
    }
}
