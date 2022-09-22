package P02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int startingYield= Integer.parseInt(scanner.nextLine());
        int spicesYield=startingYield;
        int spicesLeft=startingYield;

        int spicesTotal=0;

        int dayCounter=0;
        int workersConsume=0;

        while (spicesYield>100){

            spicesLeft=spicesYield-26;
            spicesYield=spicesYield-10;

            dayCounter++;
            spicesTotal=spicesTotal+spicesLeft;



        }


        spicesTotal=spicesTotal-26;
        System.out.println(dayCounter);
        System.out.println(spicesTotal);

    }
}
