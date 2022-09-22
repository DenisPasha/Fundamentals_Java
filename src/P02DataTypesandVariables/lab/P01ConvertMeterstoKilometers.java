package P02DataTypesandVariables.lab;

import java.util.Scanner;

public class P01ConvertMeterstoKilometers {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int num= Integer.parseInt(scanner.nextLine());

        double numInKm=num/1000.0;
        System.out.printf("%.2f",numInKm);


    }
}
