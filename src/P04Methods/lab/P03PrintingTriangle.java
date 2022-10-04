package P04Methods.lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num=Integer.parseInt(scanner.nextLine());
        printTriangle(num);
    }
    public static void printTriangle(int nums){

        for (int i = 1; i <=nums ; i++) {

            printLine(1,i);
        }
        for (int k = nums-1; k >=1 ; k--) {
            printLine(1,k);
        }

    }
    public static void printLine(int start, int end){
        for (int i = start; i <=end ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
