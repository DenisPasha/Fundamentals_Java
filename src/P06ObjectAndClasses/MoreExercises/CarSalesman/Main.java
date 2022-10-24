package P06ObjectAndClasses.MoreExercises.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<Engine>engineList=new ArrayList<>();
        List<Car>carList=new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            String engineInput=scanner.nextLine();

            String engineModel=engineInput.split(" ")[0];
            String enginePower=engineInput.split(" ")[1];
            String engineDisplacement=engineInput.split(" ")[2];
            String engineEfficiency="";

            if (engineInput.split(" ").length ==4){
                 engineEfficiency=engineInput.split(" ")[3];
            }else {
                 engineEfficiency="n/a";
            }




            Engine engine= new Engine(engineModel,enginePower,engineDisplacement,engineEfficiency);
            engineList.add(engine);

        }
        int m=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=m ; i++) {
            String carInput=scanner.nextLine();

            String carModel=carInput.split(" ")[0];
            String carEngine=carInput.split(" ")[1];

            String carWeight="";
            String carColour="";
            int length=carInput.split(" ").length;


            if (length==2){
                carColour="n/a";
                carWeight="n/a";
            } else if (length==3) {
                String lastSection=carInput.split(" ")[length-1];
                if (lastSection.contains("1") ||
                        lastSection.contains("2") ||
                        lastSection.contains("3") ||
                        lastSection.contains("4") ||
                        lastSection.contains("5") ||
                        lastSection.contains("6") ||
                        lastSection.contains("7") ||
                        lastSection.contains("8") ||
                        lastSection.contains("9") ){
                    carWeight=carInput.split(" ")[2];
                    carColour="n/a";
                }else {
                    carColour=carInput.split(" ")[2];
                    carWeight="n/a";
                }
            }else {
                String lastSection=carInput.split(" ")[length-1];
                if (lastSection.contains("1") ||
                        lastSection.contains("2") ||
                        lastSection.contains("3") ||
                        lastSection.contains("4") ||
                        lastSection.contains("5") ||
                        lastSection.contains("6") ||
                        lastSection.contains("7") ||
                        lastSection.contains("8") ||
                        lastSection.contains("9") ){
                    carWeight=carInput.split(" ")[3];
                    carColour="n/a";
                }else {
                    carColour=carInput.split(" ")[3];
                    carWeight=carInput.split(" ")[2];
                  //  carWeight="n/a";
                }
            }


            for (int j = 0; j < engineList.size(); j++) {
                Engine currentEngine=engineList.get(j);
               if (carEngine.equals(currentEngine.model)){
                   Car car= new Car(carModel,carWeight,carColour,currentEngine);
                   carList.add(car);
               }
            }

        }
        for (int i = 0; i < carList.size(); i++) {
            Car currentCar=carList.get(i);
            System.out.println(currentCar.toString());
        }

    }
}
