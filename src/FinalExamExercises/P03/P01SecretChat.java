package FinalExamExercises.P03;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command=scanner.nextLine();
        StringBuilder sb=new StringBuilder(input);

        while (!command.equals("Reveal")){


            String[] commandArr=command.split(":\\|:");

            if (commandArr[0].equals("InsertSpace")){

                int index = Integer.parseInt(commandArr[1]);
                sb.insert(index," ");
                System.out.println(sb);

            } else if (commandArr[0].equals("Reverse")) {

                String substring = commandArr[1];
               int startIndex = sb.indexOf(substring);
               int endIndex = substring.length() + startIndex;


               if (startIndex >= 0){
                   sb.replace(startIndex,endIndex,"");

                   StringBuilder newString = new StringBuilder();
                   for (int i = substring.length()-1; i >=0; i--) {
                       char current = substring.charAt(i);
                       newString.append(current);
                   }
                   sb.append(newString);
                   System.out.println(sb);
               }else {
                   System.out.println("error");
               }



            } else if (commandArr[0].equals("ChangeAll")) {
                String toReplace = commandArr[1];
                String replacement = commandArr[2];

                String text = sb.toString();
                text = text.replaceAll(toReplace,replacement);
                sb.replace(0,sb.length(),text);
                System.out.println(sb);
            }

            command=scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s",sb);

    }
}
