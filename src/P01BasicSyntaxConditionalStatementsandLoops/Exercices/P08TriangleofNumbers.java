package P01BasicSyntaxConditionalStatementsandLoops.Exercices;

import java.util.Scanner;

public class P08TriangleofNumbers {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());

        for (int i=1;i<=n; i++){

            System.out.println();

            for (int k=1; k<=i; k++){
                System.out.print(i+" ");
            }

        }



    }
}
