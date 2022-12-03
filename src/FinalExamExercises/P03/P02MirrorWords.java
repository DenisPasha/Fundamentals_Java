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
        String regex = "(@|#)(?<wodOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);

        List<String>mirrorWordsList=new ArrayList<>();
        List<String>validPairsList=new ArrayList<>();
        boolean validPairsFind=false;

        while (matcher.find()){
            validPairsFind=true;
            String firstWord= matcher.group("wodOne");
            String secondWord= matcher.group("wordTwo");
            validPairsList.add(firstWord);
            validPairsList.add(secondWord);

            StringBuilder reversed=new StringBuilder();
            for (int i = secondWord.length()-1; i >=0 ; i--) {
                char current = secondWord.charAt(i);
                reversed.append(current);
            }
            if (firstWord.equals(reversed.toString())){
                mirrorWordsList.add(firstWord);
                mirrorWordsList.add(secondWord);
            }
        }
        if (!validPairsFind){
            System.out.println("No word pairs found!");
        }else {
            System.out.printf("%d word pairs found!%n",validPairsList.size()/2);
        }


        if (mirrorWordsList.size() > 0){
            System.out.println("The mirror words are:");
            for (int i = 0; i < mirrorWordsList.size()-3; i++) {
                if (i % 2 ==0){
                    System.out.printf("%s <=> %s, ",mirrorWordsList.get(i),mirrorWordsList.get(i+1));
                 }


            }

            for (int i = mirrorWordsList.size()-3; i < mirrorWordsList.size()-1; i++) {
                if (i % 2 ==0){
                    System.out.printf("%s <=> %s",mirrorWordsList.get(i),mirrorWordsList.get(i+1));
                }
            }
        }else {
            System.out.println("No mirror words!");
        }

    }
}
