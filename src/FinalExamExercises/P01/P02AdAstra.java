package FinalExamExercises.P01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();

        String regex="([\\\\|#])(?<itemName>[A-Za-z ]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);

       List<String>itemsList=new ArrayList<>();
       List<String>dateList=new ArrayList<>();
       List<Integer>caloriesList=new ArrayList<>();

        while (matcher.find()){

            String item= matcher.group("itemName");
            String date= matcher.group("date");
            int calories= Integer.parseInt(matcher.group("calories"));

            itemsList.add(item);
            dateList.add(date);
            caloriesList.add(calories);

        }

        int sumOfCalories=0;

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
         sumOfCalories = caloriesList.stream()
                .mapToInt(Integer::intValue)
                .sum();

         int days=sumOfCalories/2000;

        System.out.printf("You have food to last you for: %d days!%n",days);

        for (int i = 0; i < itemsList.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",itemsList.get(i),dateList.get(i),caloriesList.get(i));
        }

    }
}
