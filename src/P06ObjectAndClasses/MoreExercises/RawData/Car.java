package P06ObjectAndClasses.MoreExercises.RawData;

import java.util.List;

public class Car {
    //model, engine, cargo, and a collection of exactly 4 tires

    String model;
    Engine engine;
    Cargo cargo;
    Tires tyres;

    public Car(String model, Engine engine, Cargo cargo, Tires tyres) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tyres = tyres;
    }

    public String toString(){
        return String.format("%s",model);
    }
}
