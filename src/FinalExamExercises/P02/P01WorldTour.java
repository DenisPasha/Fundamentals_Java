package FinalExamExercises.P02;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input=new StringBuilder(scanner.nextLine());


        String command=scanner.nextLine();

        while (!command.equals("Travel")){

            String[] commandArr=command.split(":");

            if (command.contains("Add Stop")){
                int index= Integer.parseInt(commandArr[1]);
                String text=commandArr[2];

                if (index>=0 && index<input.length()){
                    input.insert(index,text);
                    System.out.println(input);
                }

            } else if (command.contains("Remove Stop")) {

                int startIndex= Integer.parseInt(commandArr[1]);
                int endIndex= Integer.parseInt(commandArr[2]);

                String toRemove=input.substring(startIndex,endIndex+1);

                if (startIndex>=0 && startIndex<input.length() && endIndex+1>startIndex && endIndex+1<input.length()){
                    input.replace(startIndex,endIndex+1,"");
                    System.out.println(input);
                }

            } else if (command.contains("Switch")) {

                String old=commandArr[1];
                String newOne=commandArr[2];

               int startIndex = input.indexOf(old);
               int endIndex = startIndex+old.length();

               input.replace(startIndex,endIndex,newOne);
                System.out.println(input);
            }


            command=scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s",input);
    }
}
