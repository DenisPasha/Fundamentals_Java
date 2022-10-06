package P04Methods.Exercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());

       long fact1= calculateFactorial(num1);
       long fact2=  calculateFactorial(num2);

       double sum=fact1*1.0/fact2;
        System.out.printf("%.2f",sum);

    }
    private static long calculateFactorial(int number){

        long factoriel=1;
        for (int i = 1; i <=number ; i++) {
            factoriel=factoriel*i;
        }
        return factoriel;
    }

}
