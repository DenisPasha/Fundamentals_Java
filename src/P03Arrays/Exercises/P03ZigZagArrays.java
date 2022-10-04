package P03Arrays.Exercises;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

     int n=Integer.parseInt(scanner.nextLine());
     int []numArr1= new int[n];
        int []numArr2= new int[n];

        for (int i = 0; i < n; i++) {

            int[] inputArr=Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int num1=inputArr[0];
            int num2=inputArr[1];

            if (i%2==0){
                numArr2[i]=num1;
                numArr1[i]=num2;
            }else {
                numArr1[i]=num1;
                numArr2[i]=num2;
            }


        }
        for (int item:numArr1) {
            System.out.print(item+" ");
        }
        System.out.println();
        for (int items:numArr2) {
            System.out.print(items+" ");
        }
    }
}
