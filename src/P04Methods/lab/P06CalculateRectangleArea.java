package P04Methods.lab;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width=Integer.parseInt(scanner.nextLine());
        double length=Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f",calculateArea(width,length));

    }
    public static double calculateArea(double width,double legth){

        return width*legth;

    }

}
