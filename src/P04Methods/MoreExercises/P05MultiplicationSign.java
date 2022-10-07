package P04Methods.MoreExercises;

import java.util.Scanner;

public class P05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1=Double.parseDouble(scanner.nextLine());
        double num2=Double.parseDouble(scanner.nextLine());
        double num3=Double.parseDouble(scanner.nextLine());

        double sumOfTwo=multiply(num1,num2);
        double sumAll=multiply(sumOfTwo,num3);

        if (sumAll<0){
            System.out.println("negative");
        } else if (sumAll==0) {
            System.out.println("zero");
        }else {
            System.out.println("positive");
        }

    }

    private static double multiply(double x,double y){

        if (x == 0 || y == 0) {
            return 0;
        } else if (y > 0) {
            return x + multiply(x, y - 1);
        } else if (y < 0) {
            return -multiply(x, -y);
        } else {
            return -1;
        }
    }
}

