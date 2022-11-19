package FinalExamExercises.P03;

import java.util.*;
import java.util.regex.Matcher;

public class P03NeedforSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> map=new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String cars=scanner.nextLine();
            String[] carsArr=cars.split("\\|");

            String carModel=carsArr[0];
            int carMileage= Integer.parseInt(carsArr[1]);
            int carFuel= Integer.parseInt(carsArr[2]);

            map.put(carModel,new ArrayList<>());
            map.get(carModel).add(carMileage);
            map.get(carModel).add(carFuel);

        }

        String command=scanner.nextLine();

        while (!command.contains("Stop")){

            String[] commandArr=command.split(" : ");

            if (commandArr[0].equals("Drive")){

                String car=commandArr[1];
                int distance= Integer.parseInt(commandArr[2]);
                int fuel= Integer.parseInt(commandArr[3]);

                if (map.get(car).get(1) > fuel){
                   int newFuel=map.get(car).get(1) - fuel;
                   map.get(car).set(1,newFuel);

                   int newMileage= map.get(car).get(0) + distance;
                   map.get(car).set(0,newMileage);

                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,distance,fuel);

                    if (map.get(car).get(0)>=100000){
                        System.out.printf("Time to sell the %s!%n",car);
                        map.remove(car);
                    }

                }else {
                    System.out.println("Not enough fuel to make that ride");
                }

            } else if (commandArr[0].equals("Refuel")) {

                String car= commandArr[1];
                int fuel= Integer.parseInt(commandArr[2]);

                int initialFuel=map.get(car).get(1);
                int newFuel=initialFuel + fuel;

                int refilled=fuel;

                if (newFuel > 75){
                    newFuel=75;
                     refilled = newFuel - initialFuel;
                }

                map.get(car).set(1,newFuel);

                System.out.printf("%s refueled with %d liters%n",car,refilled);

            }else if (commandArr[0].equals("Revert")) {
                String car= commandArr[1];
                int kilometers= Integer.parseInt(commandArr[2]);

                int newKilometers=map.get(car).get(0) - kilometers;

                if (newKilometers < 10000){
                    newKilometers= 10000;
                }else {
                    System.out.printf("%s mileage decreased by %d kilometers%n",car,kilometers);
                }
                map.get(car).set(0,newKilometers);

            }


            command=scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));

        }

    }
}
