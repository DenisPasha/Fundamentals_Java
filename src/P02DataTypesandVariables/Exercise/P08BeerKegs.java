package P02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        double volume=Double.MAX_VALUE;
        String winnerModel="";

        for (int i = 1; i <=n ; i++) {

            String model=scanner.nextLine();
            double radius= Double.parseDouble(scanner.nextLine());
            double height= Double.parseDouble(scanner.nextLine());

          double currentvolume=0;
            currentvolume=Math.PI*Math.pow(radius,2)*height;

            if (currentvolume>volume){
                volume=currentvolume;
                winnerModel=model;
            }

        }
        System.out.printf("%s",winnerModel);



    }
}
