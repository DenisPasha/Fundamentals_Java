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

        for (int i = 1; i <=n; i++) {

            int [] inputArr= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int input1=inputArr[0];
            int input2=inputArr[1];


            if (i % 2==0){
               numArr1[i-1]=input2;
                numArr2[i-1]=input1;
            }else {
                numArr1[i-1]=input1;
                numArr2[i-1]=input2;
            }

        }

        for (int item:numArr1) {
            System.out.print(item+" ");
        }
        System.out.println();
        for (int item2:numArr2) {
            System.out.print(item2+" ");
        }


    }
}
