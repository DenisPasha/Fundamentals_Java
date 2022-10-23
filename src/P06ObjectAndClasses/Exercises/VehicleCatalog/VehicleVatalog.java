package P06ObjectAndClasses.Exercises.VehicleCatalog;

public class VehicleVatalog {


    String type;
    String model;
    String colour;
    double hp;

    public VehicleVatalog(String type, String model, String colour, double hp) {
        this.type = type;
        this.model = model;
        this.colour = colour;
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public double getHp() {
        return hp;
    }

    @Override
    public String toString(){

        char ch=type.toUpperCase().charAt(0);
        String newType=ch+"";
        for (int i = 1; i < type.length(); i++) {
             newType=newType+""+type.charAt(i);
        }

        return String.format("Type: %s\n" +
                "Model: %s\n" +
                "Color: %s\n" +
                "Horsepower: %.0f",newType,model,colour,hp);
    }
}
