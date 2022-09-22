package P01BasicSyntaxConditionalStatementsandLoops.lab;

import java.util.Scanner;

public class P13RefactorSumofOddNumbers {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        int sum=0;
        int counter=0;

        for (int i=1; i<=100;i++){


            if (i%2!=0){
                sum=sum+i;
                System.out.println(i);
                counter++;
            }
            if (counter==n){
                break;
            }



        }

        System.out.printf("Sum: %d",sum);

    }
}
