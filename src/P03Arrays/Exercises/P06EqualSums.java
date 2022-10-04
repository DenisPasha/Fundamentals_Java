package P03Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]inputArray= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();


        int position=0;
        boolean isNot=false;
        boolean itIs=false;

        for (int i = 0; i < inputArray.length; i++) {

            int sumToRight=0;
            int sumToLeft=0;

            for (int j = i+1; j <inputArray.length ; j++) {
                sumToRight=sumToRight+inputArray[j];
            }

            for (int k=i-1;k>=0;k--) {
                sumToLeft=sumToLeft+inputArray[k];
            }

            if (sumToLeft==sumToRight){
                itIs=true;
                position=i;
            }else {
                isNot=true;
            }
        }

        if (itIs){
            System.out.println(position);
        }else if (isNot){
            System.out.println("no");
        }else {
            System.out.println(0);
        }

    }
}
