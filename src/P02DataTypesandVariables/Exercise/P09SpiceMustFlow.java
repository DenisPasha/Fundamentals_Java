package P02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int startingYield= Integer.parseInt(scanner.nextLine());
        int yield=startingYield;
        int yieldWorkers=yield;
        int totalLeft=0;
        int days=0;

        while (yield>=100){

            yieldWorkers=yield-26;
            totalLeft=totalLeft+yieldWorkers;

            yield=yield-10;
            days++;

        }
        totalLeft=totalLeft-26;
        System.out.println(days);
        System.out.println(totalLeft);

    }
}
