package P04Methods.Exercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());

        int currentNum=0;
        boolean isDivisable=false;
        boolean holdOddDigit=false;

        for (int i = 1; i <=number ; i++) {
             currentNum=i;
            isDivisable= isDivisibleByEight(currentNum);
            holdOddDigit=hasOddDigit(currentNum);

            if (isDivisable && holdOddDigit){
                System.out.println(currentNum);
            }

        }
    }

    private static boolean isDivisibleByEight(int num){

       int totalSum=0;
       while (num>0){
           int lastNum=num%10;
           totalSum+=lastNum;
           num=num/10;
       }
       return totalSum%8==0;

    }

    private static boolean hasOddDigit(int num){

        boolean isOdd=false;
        while (num>0){
            int lastNum=num%10;

            if (lastNum%2!=0){
                isOdd=true;
            }
            num=num/10;
        }
        return isOdd;
    }

}
