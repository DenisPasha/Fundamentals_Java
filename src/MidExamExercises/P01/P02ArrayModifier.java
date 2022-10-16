package MidExamExercises.P01;

import java.util.Arrays;
import java.util.Scanner;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command=scanner.nextLine();

        while (!command.equals("end")){
            String[] commandInput=command.split(" ");

            if (commandInput[0].equals("swap")){
                int index1= Integer.parseInt(commandInput[1]);
                int index2= Integer.parseInt(commandInput[2]);

                int tempNumber=inputArr[index1];

                inputArr[index1]=inputArr[index2];
                inputArr[index2]=tempNumber;
                System.out.println();

            } else if (commandInput[0].equals("multiply")) {

                int index1= Integer.parseInt(commandInput[1]);
                int index2= Integer.parseInt(commandInput[2]);

                int multiplied=inputArr[index1]*inputArr[index2];
                inputArr[index1]=multiplied;

            } else if (commandInput[0].equals("decrease")) {

                for (int i = 0; i < inputArr.length; i++) {
                    int currentNum=inputArr[i];
                    inputArr[i]=currentNum-1;
                }
            }


            command=scanner.nextLine();
        }
        for (int i = 0; i < inputArr.length; i++) {
            if (i!=inputArr.length-1){
                System.out.printf("%d, ",inputArr[i]);
            }else {
                System.out.print(inputArr[i]);
            }

        }
    }
}
