package P02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int pouredWater=0;

        for (int i = 1; i <=n ; i++) {

            int waterIn= Integer.parseInt(scanner.nextLine());

            if (pouredWater+waterIn>255){
                System.out.println("Insufficient capacity!");
                continue;
            }
            pouredWater=pouredWater+waterIn;

        }
        System.out.printf("%d",pouredWater);

    }
}
