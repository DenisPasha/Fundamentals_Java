package P01BasicSyntaxConditionalStatementsandLoops.lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int m= Integer.parseInt(scanner.nextLine());
        int n= Integer.parseInt(scanner.nextLine());

        int sum2=n*m;
        if (n>10){
            System.out.printf("%d X %d = %d",m,n,sum2);

        }else {
            for (int i=n; i<=10; i++){

                int sum=i*m;


                System.out.printf("%d X %d = %d",m,i,sum);
                System.out.println();

            }
        }





    }
}
