package P04Methods.lab;

import java.util.Scanner;

public class P01SignofIntegerNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num=Integer.parseInt(scanner.nextLine());

        signOfInteger(num);
    }

    public static void signOfInteger(int num){

        if (num>0){
            System.out.printf("The number %d is positive.",num);
        } else if (num<0) {
            System.out.printf("The number %d is negative.",num);
        }else {
            System.out.printf("The number 0 is zero.");
        }
    }
}
