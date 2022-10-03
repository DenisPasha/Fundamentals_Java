package P03Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] inputArr= Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[]inputArrOriginal=new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            inputArrOriginal[i]=inputArr[i];
        }

        String command=scanner.nextLine();

        while (!command.equals("end")){

            String commandInput=command;

            String[] inputCommand=commandInput.split(" ");
            String mainCommand=inputCommand[0];

            if (mainCommand.equals("swap")){

                int swapNum1= Integer.parseInt(inputCommand[1]);
                int swapNum2= Integer.parseInt(inputCommand[2]);

                int movedNum=0;


                    movedNum=inputArr[swapNum1];
                    inputArr[swapNum1]=inputArr[swapNum2];
                    inputArr[swapNum2]=movedNum;


            } else if (mainCommand.equals("multiply")) {

                int multiplyNum1= Integer.parseInt(inputCommand[1]);
                int multiplyNum2= Integer.parseInt(inputCommand[2]);

              int multipliedNum= inputArr[multiplyNum1]*inputArr[multiplyNum2];
              inputArr[multiplyNum1]=multipliedNum;

            } else if (mainCommand.equals("decrease")) {

                for (int i = 0; i < inputArr.length; i++) {

                    inputArr[i]=inputArr[i]-1;
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
