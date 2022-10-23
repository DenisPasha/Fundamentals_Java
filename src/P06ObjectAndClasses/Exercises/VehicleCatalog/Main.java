package P06ObjectAndClasses.Exercises.VehicleCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        // truck Man red 200

        List<VehicleVatalog>vehiclesList=new ArrayList<>();
        while (!input.equals("End")){

            String type=input.split(" ")[0];
            String model=input.split(" ")[1];
            String colour=input.split(" ")[2];
            double hp= Double.parseDouble(input.split(" ")[3]);

            VehicleVatalog vehicleCatalog= new VehicleVatalog(type,model,colour,hp);
            vehiclesList.add(vehicleCatalog);

            input=scanner.nextLine();
        }

        String secondInput=scanner.nextLine();

        while (!secondInput.equals("Close the Catalogue")){

            String searchedModel=secondInput;

            for (int i = 0; i < vehiclesList.size(); i++) {
                VehicleVatalog currentVehicle=vehiclesList.get(i);

                if (searchedModel.equals(currentVehicle.getModel())){
                    System.out.println(currentVehicle.toString());
                }

            }
            secondInput=scanner.nextLine();
        }

        double carsHp=0;
        int carsCount=0;

        double trucksHp=0;
        int trucksCount=0;

        for (int i = 0; i < vehiclesList.size(); i++) {
            VehicleVatalog currentVehicle=vehiclesList.get(i);

            if (currentVehicle.getType().equals("car")){
                carsCount++;
                carsHp =carsHp + currentVehicle.getHp();
            }else {
                trucksCount++;
                trucksHp =trucksHp + currentVehicle.getHp();
            }

        }


        double avgTrucksHp=0;
        double avgCarsHp=0;

        if (trucksCount==0){
            trucksHp=0;
        }else {
             avgTrucksHp=trucksHp / trucksCount;
        }

        if (carsCount==0){
            carsHp=0;
        }else {
            avgCarsHp=carsHp / carsCount;
        }


        System.out.printf("Cars have average horsepower of: %.2f.%n",avgCarsHp);
        System.out.printf("Trucks have average horsepower of: %.2f.",avgTrucksHp);
    }
}
