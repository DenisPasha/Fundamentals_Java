package FinalExamExercises.P02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String regex="([=|\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);

        ArrayList<String>destinationList=new ArrayList<>();
        while (matcher.find()){
            destinationList.add(matcher.group("destination"));
        }

        int sum = 0;
        for (int i = 0; i < destinationList.size(); i++) {
            String currentDestination = destinationList.get(i);
            sum+=currentDestination.length();
        }
        System.out.printf("Destinations: %s%n",String.join(", ",destinationList));
        System.out.printf("Travel Points: %d",sum);
    }
}
