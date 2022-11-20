package FinalExamExercises.P05;

import java.util.*;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        Map<String, List<Integer>>map=new LinkedHashMap<>();


        while (!input.equals("Sail")){
            String[]inputArr=input.split("\\|\\|");

            String city=inputArr[0];
            int population= Integer.parseInt(inputArr[1]);
            int gold= Integer.parseInt(inputArr[2]);

            map.putIfAbsent(city,new ArrayList<>());

            if (map.get(city).size() <= 0) {
                map.get(city).add(0, 0);
                map.get(city).add(1, 0);

            }
            map.get(city).set(0,map.get(city).get(0)+population);
            map.get(city).set(1,map.get(city).get(1)+gold);
            input=scanner.nextLine();
        }

        String command=scanner.nextLine();
        while (!command.equals("End")){

            String[]commandArr=command.split("=>");
            String currentCommand=commandArr[0];

            if (currentCommand.equals("Plunder")){

                String town=commandArr[1];
                int people= Integer.parseInt(commandArr[2]);
                int gold= Integer.parseInt(commandArr[3]);

                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);
              map.get(town).set(0,map.get(town).get(0) - people);
              map.get(town).set(1,map.get(town).get(1) - gold);

              if (map.get(town).get(0)<=0 || map.get(town).get(1)<=0){
                  System.out.printf("%s has been wiped off the map!%n",town);
                  map.remove(town);
              }

            } else if (currentCommand.equals("Prosper")) {
                String town=commandArr[1];
                int gold= Integer.parseInt(commandArr[2]);

                if (gold <= 0){
                    System.out.printf("Gold added cannot be a negative number!%n");
                }else {
                   map.get(town).set(1,map.get(town).get(1)+gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",gold,town,map.get(town).get(1));
                }

            }


            command=scanner.nextLine();
        }

        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",map.size());

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
        }

    }
}
