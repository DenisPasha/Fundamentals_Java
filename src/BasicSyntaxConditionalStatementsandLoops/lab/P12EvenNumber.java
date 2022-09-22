package BasicSyntaxConditionalStatementsandLoops.lab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        int num= Integer.parseInt(scanner.nextLine());


        while (num%2!=0){
            System.out.printf("Please write an even number.");
            System.out.println();
           num= Integer.parseInt(scanner.nextLine());


        }
        System.out.printf("The number is: %d",Math.abs(num));




    }
}
