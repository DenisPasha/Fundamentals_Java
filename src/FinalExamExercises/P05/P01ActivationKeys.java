package FinalExamExercises.P05;

import java.util.Locale;
import java.util.Scanner;

public class P01ActivationKeys{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input=new StringBuilder(scanner.nextLine());
        String command=scanner.nextLine();

        while (!command.contains("Generate")){
            String[]commandArr=command.split(">>>");

            if (command.contains("Contains")){

                String subString=commandArr[1];
                String inputS=input.toString();
               int index=input.indexOf(subString);
                if (index >= 0){
                    System.out.printf("%s contains %s.%n",inputS,subString);
                }else {
                    System.out.printf("Substring not found!%n");
                }

            } else if (command.contains("Flip")) {

                String currentCommand=commandArr[1];
                int startIndex= Integer.parseInt(commandArr[2]);
                int  endIndex= Integer.parseInt(commandArr[3]);

                String sub=input.substring(startIndex,endIndex);

                if (currentCommand.equals("Upper")){
                    sub=sub.toUpperCase(Locale.ROOT);
                }else if (currentCommand.equals("Lower")){
                    sub=sub.toLowerCase(Locale.ROOT);
                }
                input.replace(startIndex,endIndex,sub);
                System.out.println(input);


            } else if (command.contains("Slice")) {
                int startIndex= Integer.parseInt(commandArr[1]);
                int  endIndex= Integer.parseInt(commandArr[2]);

                input.replace(startIndex,endIndex,"");
                System.out.println(input);
            }


            command=scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",input);
    }
}
