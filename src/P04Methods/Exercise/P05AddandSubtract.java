package P04Methods.Exercise;

import java.util.Scanner;

public class P05AddandSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());

       int sumOfTwo= addingFirstTwoIntegers(num1,num2);

        System.out.println(subtractingNums(num3,sumOfTwo));

    }

    private static int addingFirstTwoIntegers(int num1 , int num2){

        return num1+num2;

    }
    private static int subtractingNums(int num3 ,int addedInt){

        return addedInt-num3;

    }


}
