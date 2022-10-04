package P03Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] inputArr=Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int evenSum=0;
        int oddSum=0;

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i]%2==0){
                evenSum+=inputArr[i];
            }else {
                oddSum+=inputArr[i];
            }
        }

        int diff=evenSum-oddSum;
        System.out.println(diff);

    }
}
