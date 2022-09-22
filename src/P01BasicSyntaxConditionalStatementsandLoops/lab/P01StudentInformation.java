package P01BasicSyntaxConditionalStatementsandLoops.lab;

import java.util.Scanner;

public class P01StudentInformation {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String name= scanner.nextLine();
        int age= Integer.parseInt(scanner.nextLine());
        double score= Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,score);


    }
}
