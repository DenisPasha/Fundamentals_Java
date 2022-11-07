package P08TextProcessing.Exercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr=scanner.nextLine().split(" ");

        String one=inputArr[0];
        String two=inputArr[1];

        String shortestString=shortestString(one,two);
        String longestString=longestString(one,two);

        double sum=0;
        for (int i = 0; i < shortestString.length(); i++) {
            char currentChar=shortestString.charAt(i);
            char longestStringChar=longestString.charAt(i);

            sum=sum+currentChar*longestStringChar;
        }

        for (int i = shortestString.length(); i < longestString.length(); i++) {
            char curr=longestString.charAt(i);
            sum=sum+curr;
        }

        System.out.printf("%.0f",sum);


    }

    private static String shortestString(String one,String two){
        if (one.length()>two.length()){
            return two;
        }else {
            return one;
        }
    }

    private static String longestString(String one,String two){
        if (one.length()>two.length()){
            return one;
        }else {
            return two;
        }
    }
}
