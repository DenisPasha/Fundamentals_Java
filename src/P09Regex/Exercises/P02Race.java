package P09Regex.Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names=scanner.nextLine();
        String command=scanner.nextLine();
        StringBuilder name=new StringBuilder();

        List<String>namesList= List.of(names.split(", "));

        Map<String,Integer>racersMap=new LinkedHashMap<>();

        namesList.forEach(nameOfRacer -> racersMap.put(nameOfRacer,0));



        while (!command.equals("end of race")){

            String regexForName="[A-Za-z]+";
            Pattern namePattern= Pattern.compile(regexForName);
            Matcher nameMatcher=namePattern.matcher(command);

            while (nameMatcher.find()){
                name.append(nameMatcher.group());
            }

            String regexForDistance="[0-9]";
            Pattern distancePattern= Pattern.compile(regexForDistance);
            Matcher distanceMatcher=distancePattern.matcher(command);
            int currentDistance=0;

            while (distanceMatcher.find()){
                int distance= Integer.parseInt(distanceMatcher.group());
                currentDistance+=distance;
            }

            String currentName=name.toString();
            if (racersMap.containsKey(currentName)){
                racersMap.put(currentName,racersMap.get(currentName)+currentDistance);
            }
            name.replace(0,name.length(),"");

            command=scanner.nextLine();
        }


        Stream<Map.Entry<String,Integer>> sorted =
                racersMap.entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

        Stream<Map.Entry<String,Integer>> sorted2 =
                sorted.limit(3);


        List<String>racersTopThree=new ArrayList<>();
        sorted2.forEach(stringIntegerEntry -> racersTopThree.add(stringIntegerEntry.getKey()));

        for (int i = 0; i < racersTopThree.size(); i++) {
            if (i+1==1){
                System.out.printf("%dst place: %s%n",i+1,racersTopThree.get(i));
            } else if (i+1==2) {
                System.out.printf("%dnd place: %s%n",i+1,racersTopThree.get(i));
            } else if (i+1==3) {
                System.out.printf("%drd place: %s%n",i+1,racersTopThree.get(i));
            }

        }

    }
}
