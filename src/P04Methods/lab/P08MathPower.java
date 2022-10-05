package P04Methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num=Double.parseDouble(scanner.nextLine());
        double power=Double.parseDouble(scanner.nextLine());


        String patters="0.####";
        DecimalFormat df= new DecimalFormat(patters);

        String format=df.format(resultOfPower(num,power));
        System.out.println(format);


    }

    public static double resultOfPower(double num, double power){


       double result=Math.pow(num,power);
        return result;

    }
}
