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
        List<String>destinationsList=new ArrayList<>();

        String regex="([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);

        while (matcher.find()){
            destinationsList.add(matcher.group("destination"));
        }


        int points= destinationsList.stream()
                .mapToInt(String::length)
                .sum();

        if (destinationsList.size()>0){
            System.out.print("Destinations: ");
            System.out.println(String.join(", ",destinationsList));
            System.out.println();
            System.out.printf("Travel Points: %d",points);
        }else {
            System.out.print("Destinations:");
            System.out.println();
            System.out.printf("Travel Points: %d",points);
        }
    }
}
