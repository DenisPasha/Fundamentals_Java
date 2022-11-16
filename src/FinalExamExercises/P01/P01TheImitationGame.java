package FinalExamExercises.P01;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        StringBuilder sb= new StringBuilder(input);

        String command=scanner.nextLine();

        while (!command.equals("Decode")){

            if (command.contains("ChangeAll")){
                String[]commandArr=command.split("\\|");
                String changeThisString=commandArr[1];
                String changeWithThisString=commandArr[2];

                char changeThis=changeThisString.charAt(0);
                char changeWithThis=changeWithThisString.charAt(0);

              input= sb.toString();
             input=input.replace(changeThis,changeWithThis);
             sb.replace(0,sb.length(),input);

            } else if (command.contains("Insert")) {

                String[]commandArr=command.split("\\|");

                int index= Integer.parseInt(commandArr[1]);
                String letter=commandArr[2];
                sb.insert(index,letter);


            } else if (command.contains("Move")) {
                String[]commandArr=command.split("\\|");

                int index= Integer.parseInt(commandArr[1]);
                int length= sb.length();

              String temp=sb.substring(0,index);
              sb.replace(0,index,"");
              sb.append(temp);

            }

            command=scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s",sb);
    }
}
