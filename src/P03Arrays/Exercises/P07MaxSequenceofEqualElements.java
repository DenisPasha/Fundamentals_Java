package P03Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceofEqualElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[]nums= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();
        int counter = 1;
        int theMost = 0;
        int element = 0;

        for (int i = 0 ; i < nums.length - 1; i++)
        {
            if (nums[i] == nums[i + 1]) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > theMost)
            {
                theMost = counter;
                element = nums[i];
            }
        }
        for (int j = 1; j <= theMost; j++)
        {
            System.out.print(element+" ");

        }

    }
}

