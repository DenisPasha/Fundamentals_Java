package P03Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceofEqualElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[]nums= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();


        int previousNum=0;
        int sequenceNum=0;
        int counter=1;
        int lastSequenceCount=0;
        for (int i = 0; i < nums.length-1; i++) {


            if (nums[i]==nums[i+1]){

                counter++;
            }else {
                counter=1;
            }
            if (counter>lastSequenceCount){
                lastSequenceCount=counter;
                sequenceNum=nums[i];
            }

        }
        for (int i = 1; i <= lastSequenceCount; i++) {
            System.out.print(sequenceNum+" ");
        }

    }
}

