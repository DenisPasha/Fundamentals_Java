package P03Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[]inputArray= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();

        for (int i = 0; i <inputArray.length ; i++) {

            int currentNum=inputArray[i];


            for (int j = i+1; j <inputArray.length ; j++) {


                if (currentNum>inputArray[j]){
                    System.out.print(currentNum+" ");

                }




                break;

            }

        }
        System.out.print(inputArray[inputArray.length-1]);
    }
}
