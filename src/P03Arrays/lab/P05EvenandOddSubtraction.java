package P03Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);





        int[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e-> Integer.parseInt(e)).toArray();

        int evenSum=0;
        int oddSum=0;


        for (int number:numbers) {
            if (number % 2 == 0){
                evenSum+=number;
            }else {
                oddSum+=number;
            }
            
        }
        int diff=evenSum-oddSum;
        System.out.println(diff);

    }
}
