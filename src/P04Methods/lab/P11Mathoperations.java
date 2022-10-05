package P04Methods.lab;

import java.util.Scanner;

public class P11Mathoperations {
    public static void main(String[] args) {


        System.out.printf("%.0f",calculateNumber());



    }

    public static double calculateNumber(){
        Scanner scanner = new Scanner(System.in);

        double num1=Double.parseDouble(scanner.nextLine());
        String operator=scanner.nextLine();
        double num2 =Double.parseDouble(scanner.nextLine());
        double sum=0;
        switch (operator){
            case "/":
                sum= num1/num2;
                break;
            case "*":
                sum= num1*num2;
                break;
            case "-":
                sum= num1-num2;
                break;
            case "+":
                sum= num1+num2;
                break;

        }
        return sum;

    }

}
