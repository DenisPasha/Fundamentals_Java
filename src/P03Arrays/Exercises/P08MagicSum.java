package P03Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr= Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int num=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputArr.length; i++) {

            int currentNum=inputArr[i];

            for (int j = i; j < inputArr.length; j++) {

                if (currentNum+inputArr[j]==num){
                    System.out.print(currentNum+" "+inputArr[j]);
                    System.out.println();
                }
            }

        }

    }
}
