package P09Regex.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        String toUpper=input.toUpperCase();


        String regex="\\D+";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(toUpper);

        String digitsRegex="\\d+";
        Pattern digitsPattern= Pattern.compile(digitsRegex);
        Matcher digitsMatcher= digitsPattern.matcher(toUpper);

        int uniqueSymbolsCount=0;
        StringBuilder sb=new StringBuilder();

        while (matcher.find()){

            String text= matcher.group();

            while (digitsMatcher.find()){
                int digit= Integer.parseInt(digitsMatcher.group());
                for (int i = 1; i <=digit ; i++) {
                    sb.append(text);
                }
                break;
            }
        }

        StringBuilder sbNew=new StringBuilder();

        String regexNew="\\D";
        Pattern pattern1= Pattern.compile(regexNew);
        Matcher matcher1=pattern1.matcher(toUpper);
        StringBuilder temp=new StringBuilder();

        while (matcher1.find()){
            temp.append(matcher1.group());
        }

        boolean notValid=false;
        for (int i = 0; i <temp.length() ; i++) {
            String currentChar= String.valueOf(temp.charAt(i));
            notValid=false;

            for (int j = 0; j <sbNew.length() ; j++) {
                String currentCharNew= String.valueOf(sbNew.charAt(j));
                if (currentChar.equals(currentCharNew)){
                    notValid=true;
                }

            }
            if (!notValid){
                sbNew.append(currentChar);
            }

        }
          System.out.printf("Unique symbols used: %d%n",sbNew.length());

        System.out.printf("%s",sb);


    }
}

