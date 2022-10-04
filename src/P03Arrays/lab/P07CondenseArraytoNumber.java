package P03Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArraytoNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     int[] inputArr=Arrays.stream(scanner.nextLine().split(" "))
             .mapToInt(Integer::parseInt)
             .toArray();

     while (inputArr.length!=1){

         int [] condensed=new int[inputArr.length-1];

         for (int i = 0; i < condensed.length; i++) {
             condensed[i]=inputArr[i]+inputArr[i+1];

         }
         inputArr=condensed;
     }
        for (int item:inputArr) {
            System.out.print(item+" ");
        }
    }
}
