package FinalExamExercises.P02;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops=scanner.nextLine();
        StringBuilder sb=new StringBuilder(stops);
        String command=scanner.nextLine();
        while (!command.equals("Travel")){
            String[] commandArr=command.split(":");

            if (commandArr[0].equals("Add Stop")){
                int index = Integer.parseInt(commandArr[1]);
                String destination = commandArr[2];

                if (index >=0 && index < sb.length()){
                    sb.insert(index,destination);

                }
                System.out.println(sb);

            } else if (commandArr[0].equals("Remove Stop")) {
                int startIndex = Integer.parseInt(commandArr[1]);
                int endIndex = Integer.parseInt(commandArr[2]);

                if (startIndex >=0  && endIndex < sb.length()){
                    sb.replace(startIndex,endIndex+1,"");

                }
                System.out.println(sb);

            }else if (commandArr[0].equals("Switch")){
                String oldDestination=commandArr[1];
                String newDestination=commandArr[2];

                String dest=sb.toString();
               //dest=dest.replaceFirst(oldDestination,newDestination);
             dest = dest.replaceAll(oldDestination,newDestination);
               sb.replace(0,sb.length(),dest);

                System.out.println(sb);
            }


            command=scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",sb);

    }
}
