package P03Arrays.lab;

import java.util.Scanner;

public class P02PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n =Integer.parseInt(scanner.nextLine());
        int [] numbers= new int[n];

        for (int i = 0; i <n ; i++) {

            int num=Integer.parseInt(scanner.nextLine());
            numbers[i]=num;

        }

        for (int j = numbers.length-1; j >=0 ; j--) {

            System.out.printf("%d ",numbers[j]);

        }



    }
}
