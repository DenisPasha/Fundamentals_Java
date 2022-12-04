package finalExam;

import java.util.Locale;
import java.util.Scanner;

public class P01DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!commands.contains("Finish")){

            String[] commandArr = commands.split(" ");
            String mainCommand=commandArr[0];

            if (mainCommand.equals("Replace")){

                String  oldChar = commandArr[1];
                String newChar = commandArr[2];

              message=message.replace(oldChar,newChar);
                System.out.println(message);

            } else if (mainCommand.equals("Cut")) {

                int startIndex = Integer.parseInt(commandArr[1]);
                int endIndex = Integer.parseInt(commandArr[2]);


                if (startIndex >= 0 && endIndex < message.length()){

                    StringBuilder sb =new StringBuilder(message);
                    sb.replace(startIndex,endIndex+1,"");
                    message= sb.toString();
                    System.out.println(message);
                }else {
                    System.out.println("Invalid indices!");
                }



            }else if (mainCommand.equals("Make")) {

                String upOrLow=commandArr[1];
                if (upOrLow.equals("Upper")){
                    message = message.toUpperCase(Locale.ROOT);
                } else if (upOrLow.equals("Lower")) {
                    message = message.toLowerCase(Locale.ROOT);
                }
                System.out.println(message);

            }else if (mainCommand.equals("Check")) {

                String text = commandArr[1];

                if (message.contains(text)){
                    System.out.printf("Message contains %s%n",text);
                }else {
                    System.out.printf("Message doesn't contain %s%n",text);
                }

            }else if (mainCommand.equals("Sum")) {

                int startIndex = Integer.parseInt(commandArr[1]);
                int endIndex = Integer.parseInt(commandArr[2]);

                if (startIndex >=0 && endIndex < message.length()){
                   String text = message.substring(startIndex,endIndex+1);

                   int sum = 0;
                    for (int i = 0; i < text.length(); i++) {
                        char currentChar = text.charAt(i);
                        sum+=currentChar;
                    }
                    System.out.println(sum);

                }else {
                    System.out.println("Invalid indices!");
                }
            }

            commands=scanner.nextLine();
        }
    }
}
