package FinalExamExercises.P02;

import java.util.*;
import java.util.regex.Matcher;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String,List<Double>> map=new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String input=scanner.nextLine();
            String[]inputArr= input.split("<->");

            String plantName=inputArr[0];
            double rarity= Integer.parseInt(inputArr[1]);

            map.putIfAbsent(plantName,new ArrayList<>());
            map.get(plantName).add(rarity);

        }
        String command=scanner.nextLine();

        while (!command.equals("Exhibition")){

            if (command.contains("Rate")){

                String[] commands=command.split(": ");
                String temp= commands[1];

                String[]commandArr=temp.split(" - ");
                String plant=commandArr[0];
                double rating= Integer.parseInt(commandArr[1]);

                if (map.containsKey(plant)){
                    map.get(plant).add(rating);
                }else {
                    System.out.println("error");
                }



            } else if (command.contains("Update")) {

                String[] commands=command.split(": ");
                String temp= commands[1];

                String[]commandArr=temp.split(" - ");
                String plant=commandArr[0];
                double  rarity= Integer.parseInt(commandArr[1]);

                if (map.containsKey(plant)){
                    map.get(plant).set(0,rarity);
                }else {
                    System.out.println("error");
                }



            } else if (command.contains("Reset")) {
                String[] commandArr=command.split(": ");
                String plant=commandArr[1];

                if (map.containsKey(plant)){
                    for (int i = 1; i < map.get(plant).size(); i++) {
                        map.get(plant).remove(i);
                    }

                }else {
                    System.out.println("error");
                }



            }


            command=scanner.nextLine();
        }

        double averageRating=0;
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {

            String plant= entry.getKey();

            int totalRating=0;
            int length=map.get(plant).size()-1;

            for (int i = 1; i <map.get(plant).size() ; i++) {
                totalRating+=map.get(plant).get(i);
            }
            if (length!=0){
                averageRating=totalRating*1.0/length;
            }


            System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n",plant,map.get(plant).get(0),averageRating);

        }

    }
}
