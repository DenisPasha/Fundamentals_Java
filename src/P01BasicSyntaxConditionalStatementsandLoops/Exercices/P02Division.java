package P01BasicSyntaxConditionalStatementsandLoops.Exercices;

import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);


        int num= Integer.parseInt(scanner.nextLine());
        int count=0;

        if (num%2==0){

            count=+2;
        }

        if (num%3==0){

            count=0;
            count=+3;
        }

         if (num%6==0){

             count=0;
             count=+6;
        }

        if (num%7==0){

            count=0;
            count=+7;
        }

        if (num%10==0){

            count=0;
            count=+10;
        }

        if (count==2){
            System.out.printf("The number is divisible by 2");
        }else if (count==3){
            System.out.printf("The number is divisible by 3");
        } else if (count==6) {
            System.out.printf("The number is divisible by 6");
        } else if (count==7) {
            System.out.printf("The number is divisible by 7");
        } else if (count==10) {
            System.out.printf("The number is divisible by 10");
        }else {
            System.out.println("Not divisible");
        }


    }
}
