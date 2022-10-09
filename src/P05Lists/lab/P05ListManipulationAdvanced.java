package P05Lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command=scanner.nextLine();



        while (!command.equals("end")){

            List<String> commandList= List.of(command.split(" "));

            if(command.contains("Contains")){
                printContains(inputList,commandList);

            } else if (command.equals("Print even")) {
                printEven(inputList,commandList);
            } else if (command.equals("Print odd")) {
                prindOdd(inputList,commandList);
            } else if (command.equals("Get sum")) {
                getSum(inputList,commandList);
            } else if (command.contains("Filter")) {
                filter(inputList,commandList);
            }


            command=scanner.nextLine();

        }

    }

    private static void filter(List<Integer> inputList, List<String> commandList) {

        String operator=commandList.get(1);
        int number= Integer.parseInt(commandList.get(2));

       switch (operator){
           case "<":
               for (int i = 0; i < inputList.size(); i++) {
                   int currentNum=inputList.get(i);
                   if (currentNum<number){
                       System.out.print(currentNum+" ");
                   }
               }
               System.out.println();
               break;
           case "<=":
               for (int i = 0; i < inputList.size(); i++) {
                   int currentNum=inputList.get(i);
                   if (currentNum<=number){
                       System.out.print(currentNum+" ");
                   }
               }
               System.out.println();
               break;
           case ">":
               for (int i = 0; i < inputList.size(); i++) {
                   int currentNum=inputList.get(i);
                   if (currentNum>number){
                       System.out.print(currentNum+" ");
                   }
               }
               System.out.println();
               break;
           case">=":
               for (int i = 0; i < inputList.size(); i++) {
                   int currentNum=inputList.get(i);
                   if (currentNum>=number){
                       System.out.print(currentNum+" ");
                   }
               }
               System.out.println();
               break;
       }

    }

    private static void getSum(List<Integer> inputList, List<String> commandList) {

        int sum=0;
        for (int i = 0; i < inputList.size(); i++) {
            int currentNum=inputList.get(i);

            sum+=currentNum;

        }
        System.out.println(sum);
    }

    private static void prindOdd(List<Integer> inputList, List<String> commandList) {
        for (int i = 0; i < inputList.size(); i++) {
            int currentNum=inputList.get(i);
            if (currentNum % 2!=0){
                System.out.print(currentNum+" ");
            }
        }
        System.out.println();
    }

    private static void printEven(List<Integer> inputList, List<String> commandList) {

        for (int i = 0; i < inputList.size(); i++) {
            int currentNum=inputList.get(i);
            if (currentNum % 2==0){
                System.out.print(currentNum+" ");
            }
        }
        System.out.println();
    }

    private static void printContains(List<Integer> inputList, List<String> commandList){

        boolean isContaining=false;
        int searchedNumber= Integer.parseInt(commandList.get(1));

        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i)==searchedNumber){
                isContaining=true;
                break;
            }
        }
        if (isContaining){
            System.out.println("Yes");
        }else {
            System.out.println("No such number");
        }
    }


}
