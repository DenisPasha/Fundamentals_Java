package MidExamExercises.P05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String one=scanner.nextLine();
        String two=scanner.nextLine();

        List<Integer>pirateShipList=Arrays.stream(one.split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer>warShipList=Arrays.stream(two.split(">")).map(Integer::parseInt).collect(Collectors.toList());
//        List<Integer>pirateShipList= Arrays.stream(scanner.nextLine().split(">"))
//                .map(Integer::parseInt).collect(Collectors.toList());
//
//        List<Integer>warShipList= Arrays.stream(scanner.nextLine().split(">"))
//                .map(Integer::parseInt).collect(Collectors.toList());

        int maxHealthOfEachIndex=Integer.parseInt(scanner.nextLine());

        String command=scanner.nextLine();
        boolean warFinished=false;

        while (!command.contains("Retire")){

            List<String>commandList= List.of(command.split(" "));

            if (commandList.get(0).equals("Fire")){

                int index= Integer.parseInt(commandList.get(1));
                int damage= Integer.parseInt(commandList.get(2));

                // check if index is valid
               if (index >= 0 && index < warShipList.size()){
                   //modifying the attacked index/section
                 int attackedSection = warShipList.get(index);
                 attackedSection-=damage;
                 warShipList.set(index,attackedSection);

                 //check if section is 0
                 if (attackedSection <=0){
                     System.out.println("You won! The enemy ship has sunken.");
                     warFinished=true;
                     break;
                 }
               }

            } else if (commandList.get(0).equals("Defend")) {

                int startIndex= Integer.parseInt(commandList.get(1));
                int endIndex= Integer.parseInt(commandList.get(2));
                int damage= Integer.parseInt(commandList.get(3));

                //check if index is valid
                if (startIndex >= 0 && startIndex < pirateShipList.size() && endIndex > 0 && endIndex < pirateShipList.size() && startIndex < endIndex){

                    //modifying the section with the damage
                    for (int i = startIndex; i <= endIndex; i++) {
                        int currentSection=pirateShipList.get(i);

                        currentSection-=damage;
                        pirateShipList.set(i,currentSection);

                        //check if section broke
                        if (currentSection <=0){
                            System.out.println("You lost! The pirate ship has sunken.");
                            warFinished=true;
                            break;
                        }

                    }
                }

            } else if (commandList.get(0).equals("Repair")) {

                int index= Integer.parseInt(commandList.get(1));
                int health= Integer.parseInt(commandList.get(2));

                // validating index
                if (index >=0 && index < pirateShipList.size()){
                    //updating a section health
                    int currentSection=pirateShipList.get(index);
                    if (currentSection + health <= maxHealthOfEachIndex){
                        currentSection = currentSection+health;
                        pirateShipList.set(index,currentSection);
                    }else {
                        currentSection = maxHealthOfEachIndex;

                    }
                }

            } else if (commandList.get(0).equals("Status")) {

                int needRepairCount=0;
                for (int i = 0; i < pirateShipList.size(); i++) {
                    int currentSection= pirateShipList.get(i);

                    double percent=(currentSection*1.0 / maxHealthOfEachIndex) *100;
                    if (percent < 20.00){
                        needRepairCount++;
                    }
                }
                System.out.printf("%d sections need repair.",needRepairCount);
                System.out.println();
            }

            command=scanner.nextLine();
        }
        //summing all the sections of both ships
        int pirateSum=0;
        for (int item:pirateShipList) {
            pirateSum+=item;
        }

        int warShipSum=0;
        for (int item:warShipList) {
            warShipSum+=item;
        }

        if (!warFinished){
            System.out.printf("Pirate ship status: %d\n" +
                    "Warship status: %d",pirateSum,warShipSum);
        }

    }
}
