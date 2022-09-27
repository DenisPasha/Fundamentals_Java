package P02DataTypesandVariables.MoreExercises;

import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double a = Float.parseFloat(scanner.nextLine());
        double b = Float.parseFloat(scanner.nextLine());

        final double precisionLevel = 0.000001f;


        if (Math.abs(a-b) > precisionLevel){
            System.out.println("False");

        } else{
            System.out.println("True");
        }
    }
}
