package P06ObjectAndClasses.MoreExercises.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());


        //car list
        List<Car>carList= new ArrayList<>();

        for (int i = 1; i <=n ; i++) {

            String input=scanner.nextLine();

            //car
            String model=input.split(" ")[0];

            //engine
            int  engineSpeed= Integer.parseInt(input.split(" ")[1]);
            int  enginePower= Integer.parseInt(input.split(" ")[2]);

            //cargo
            int cargoWeight= Integer.parseInt(input.split(" ")[3]);
            String cargoType=input.split(" ")[4];

            //tyres
            double tyre1Pressure= Double.parseDouble(input.split(" ")[5]);
            int tyre1Age= Integer.parseInt(input.split(" ")[6]);

            double tyre2Pressure= Double.parseDouble(input.split(" ")[7]);
            int tyre2Age= Integer.parseInt(input.split(" ")[8]);

            double tyre3Pressure= Double.parseDouble(input.split(" ")[9]);
            int tyre3Age= Integer.parseInt(input.split(" ")[10]);

            double tyre4Pressure= Double.parseDouble(input.split(" ")[11]);
            int tyre4Age= Integer.parseInt(input.split(" ")[12]);

            Engine engine= new Engine(engineSpeed,enginePower);
            Cargo cargo= new Cargo(cargoWeight,cargoType);
            Tires tyres= new Tires(tyre1Pressure,tyre1Age,tyre2Pressure,tyre2Age,tyre3Pressure,tyre3Age,tyre4Pressure,tyre4Age);

            //adding every car object to a list
            Car car= new Car(model,engine,cargo,tyres);
            carList.add(car);

        }

        String command=scanner.nextLine();


        if (command.equals("fragile")){

            for (int i = 0; i < carList.size(); i++) {
                Car currentCar= carList.get(i);

                if (currentCar.cargo.cargoType.equals("fragile")
                        && currentCar.tyres.tyre1Pressure < 1 || currentCar.tyres.tyre2Pressure < 1 ||
                        currentCar.tyres.tyre3Pressure < 1 || currentCar.tyres.tyre4Pressure < 1){
                    System.out.println(currentCar.toString());
                }
            }

        } else if (command.equals("flamable")) {

            for (int i = 0; i < carList.size(); i++) {
                Car currentCar=carList.get(i);
                if (currentCar.cargo.cargoType.equals("flamable") && currentCar.engine.enginePower > 250){
                    System.out.println(currentCar.toString());
                }
            }
        }

    }
}
