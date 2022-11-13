package P09Regex.MoreExercises;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= String.valueOf(scanner.nextLine());
        List<String> ticketList= List.of(input.split("[,\\s+]+"));

        for (int i = 0; i < ticketList.size(); i++) {
            String currentTicket=ticketList.get(i);

            if (currentTicket.length()==20){

                StringBuilder firstHalfTicket=new StringBuilder();
                for (int j = 0; j < currentTicket.length()/2 ; j++) {
                    firstHalfTicket.append(currentTicket.charAt(j));
                }

                StringBuilder secondHalfTicket=new StringBuilder();
                for (int j = currentTicket.length()/2-1; j < currentTicket.length(); j++) {
                    secondHalfTicket.append(currentTicket.charAt(j));
                }

                String regex="[@#$^]{6,10}";
                Pattern pattern= Pattern.compile(regex);
                Matcher firstHalfMatcher= pattern.matcher(firstHalfTicket);
                Matcher secondHalfMatcher= pattern.matcher(secondHalfTicket);

                StringBuilder fHalfBuilder=new StringBuilder();
                StringBuilder sHalfBuilder=new StringBuilder();

                while (firstHalfMatcher.find()){
                    fHalfBuilder.append(firstHalfMatcher.group());
                }
                while (secondHalfMatcher.find()){
                    sHalfBuilder.append(secondHalfMatcher.group());
                }

                boolean isValid=true;
                if (fHalfBuilder.length()==0){
                    isValid=false;
                }
                if (isValid){
                    for (int j = 0; j <fHalfBuilder.length() ; j++) {
                        char fHalfCurrentChar=fHalfBuilder.charAt(j);
                        for (int k = 0; k < sHalfBuilder.length(); k++) {
                            char sHalfCurrentChar=fHalfBuilder.charAt(k);

                            if (fHalfCurrentChar!=sHalfCurrentChar){
                                isValid=false;
                            }
                        }
                    }
                }else {
                    System.out.printf("ticket \"%s\" - no match",currentTicket);
                }



                if (isValid){
                    char symbol=fHalfBuilder.charAt(0);
                    int dollarsWon=fHalfBuilder.length();
                    if (dollarsWon==10){
                        System.out.printf("ticket \"%s\" - %d%c Jackpot!%n",currentTicket,dollarsWon,symbol);
                    }else {
                        System.out.printf("ticket \"%s\" - %d%c%n",currentTicket,dollarsWon,symbol);
                    }
                }


            }else {
                System.out.println("invalid ticket");
            }


        }

    }
}
