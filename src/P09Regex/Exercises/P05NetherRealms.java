package P09Regex.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //List<String>namesList= Arrays.stream(scanner.nextLine().split(",\s+")).collect(Collectors.toList());
        String input= String.valueOf(scanner.nextLine());
        List<String>namesList= List.of(input.split(", +"));


        for (int i = 0; i < namesList.size(); i++) {
            String currentName= namesList.get(i);

            int health=0;
            double damage=0;

            String lettersRegex="[A-Za-z]";
            Pattern lettersPattern= Pattern.compile(lettersRegex);
            Matcher lettersMatcher=lettersPattern.matcher(currentName);

            while (lettersMatcher.find()){
                health+=lettersMatcher.group().charAt(0);
            }

            String digitRegex="-*\\d[.]?\\d?";
            Pattern digitPattern= Pattern.compile(digitRegex);
            Matcher digitMatcher=digitPattern.matcher(currentName);
            double sum=0;
            while (digitMatcher.find()){
                double num= Double.parseDouble(digitMatcher.group());
                sum+=num;
            }

            String regexMorD="[*\\/]";
            Pattern symbolPattern= Pattern.compile(regexMorD);
            Matcher symbolMatcher = symbolPattern.matcher(currentName);

            while (symbolMatcher.find()){
                char currentSymbol=symbolMatcher.group().charAt(0);
                if (currentSymbol == '*'){
                    sum=sum*2;
                } else if (currentSymbol == '/') {
                    sum=sum/2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n",currentName,health,sum);

        }

    }
}
