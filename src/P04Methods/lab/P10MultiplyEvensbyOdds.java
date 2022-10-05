package P04Methods.lab;

import java.util.Scanner;

public class P10MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1=Integer.parseInt(scanner.nextLine());

        int num=Math.abs(num1);
        System.out.println(multiplyEvenByOdds(num));

    }

    public static int multiplyEvenByOdds(int num){

        int evenSum=getEvenNumResult(num);
        int oddSum=getOddNumResult(num);
        return evenSum*oddSum;

    }

    public static int getEvenNumResult(int num){

        int evenResult=0;

        while (num>0){
            int lastNum=num%10;
            if (lastNum%2==0){
                evenResult+=lastNum;
            }
            num=num/10;
        }
        return evenResult;
        }


    public static int getOddNumResult(int num){

        int oddResult=0;

        while (num>0){
            int lastNum=num%10;

            if (lastNum%2!=0){
                oddResult+=lastNum;
            }
            num=num/10;
        }
        return oddResult;

    }

}
