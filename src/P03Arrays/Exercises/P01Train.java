package P03Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     int n=Integer.parseInt(scanner.nextLine());

     int sum=0;
     int numbers[]=new int[n];
        for (int i = 0; i <n ; i++) {

             int number=Integer.parseInt(scanner.nextLine());

             sum+=number;
             numbers[i]=number;

        }
        for (int item:numbers) {
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println(sum);


    }
}
