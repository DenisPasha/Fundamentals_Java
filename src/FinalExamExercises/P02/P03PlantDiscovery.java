package FinalExamExercises.P02;

import java.util.*;


public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String,List<Double>>map=new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {

            String[] inputArr=scanner.nextLine().split("<->");
            String plant=inputArr[0];
            double rarity= Double.parseDouble(inputArr[1]);

            map.putIfAbsent(plant,new ArrayList<>());
            map.get(plant).add(rarity);

        }

        String command=scanner.nextLine();

        while (!command.equals("Exhibition")){
            String[] commandArr=command.split(": ");
            String mainCommand=commandArr[0];

            if (mainCommand.equals("Rate")){
                String[] plantAndRating=commandArr[1].split(" - ");
                String plant = plantAndRating[0];
                double rating = Double.parseDouble(plantAndRating[1]);

                if (map.containsKey(plant)){
                    map.get(plant).add(rating);
                }else {
                    System.out.println("error");
                }


            }else if (mainCommand.equals("Update")){
                String[] plantAndRarity=commandArr[1].split(" - ");
                String plant = plantAndRarity[0];
                double newRarity = Double.parseDouble(plantAndRarity[1]);

                if (map.containsKey(plant)){
                    map.get(plant).set(0,newRarity);
                }else {
                    System.out.println("error");
                }


            } else if (mainCommand.equals("Reset")) {
                String plant=commandArr[1];

                if (map.containsKey(plant)){
                    int sizeOfList = map.get(plant).size();

                    while (sizeOfList > 1){
                        map.get(plant).remove(sizeOfList-1);
                        sizeOfList--;
                    }
                }else {
                    System.out.println("error");
                }



            }
            command=scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {

            double sum = 0;

            for (int i = 1; i < entry.getValue().size(); i++) {
                double currentRating = entry.getValue().get(i);
                sum+=currentRating;
            }
            double averageRating = 0;
            if (sum > 0){
                int divideBy = entry.getValue().size();
                int last = divideBy - 1;
                 averageRating = sum / last ;
            }

            String plantName = entry.getKey();
            double rarity = entry.getValue().get(0);

            System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n",plantName,rarity,averageRating);

        }


    }
}
