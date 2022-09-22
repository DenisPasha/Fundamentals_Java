package BasicSyntaxConditionalStatementsandLoops.lab;

import java.util.Scanner;

public class P03PassedorFailed {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        double grade= Double.parseDouble(scanner.nextLine());

        if (grade>2.99){
            System.out.printf("Passed!");
        }else {
            System.out.printf("Failed!");
        }



    }
}
