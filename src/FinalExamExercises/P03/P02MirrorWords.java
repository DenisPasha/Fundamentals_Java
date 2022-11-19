package FinalExamExercises.P03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex="([@#])(?<validWord>[A-Za-z]{3,})\\1([@#])(?<validWord2>[A-Za-z]{3,})\\1";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);

        List<String>wordsList=new ArrayList<>();
        List<String>validWordList=new ArrayList<>();


        while (matcher.find()){
            wordsList.add(matcher.group("validWord"));
            wordsList.add(matcher.group("validWord2"));
        }

        for (int i = 0; i < wordsList.size()-1; i+=2) {
            String currentWord= wordsList.get(i);
            String nextWord= wordsList.get(i+1);

            StringBuilder reversed=new StringBuilder();
            for (int j = nextWord.length()-1; j >=0; j--) {
                char currentChar=nextWord.charAt(j);
                reversed.append(currentChar);
            }

            if (currentWord.equals(reversed.toString())){
                validWordList.add(currentWord);
                validWordList.add(nextWord);
            }
        }

        if (wordsList.size()<=0){
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }else {
            System.out.printf("%d word pairs found!%n",wordsList.size()/2);
            if (validWordList.size()<=0){
                System.out.println("No mirror words!");
            }else {
                System.out.printf("The mirror words are:%n");
                for (int i = 0; i < validWordList.size()-3; i+=2) {
                    String currentWord= validWordList.get(i);
                    String nextWord= validWordList.get(i+1);

                    System.out.printf("%s <=> %s, ",currentWord,nextWord);
                }
                for (int i = validWordList.size()-2; i < validWordList.size()-1; i++) {
                    String currentWord= validWordList.get(i);
                    String nextWord= validWordList.get(i+1);

                    System.out.printf("%s <=> %s",currentWord,nextWord);
                }

            }
        }

    }
}
