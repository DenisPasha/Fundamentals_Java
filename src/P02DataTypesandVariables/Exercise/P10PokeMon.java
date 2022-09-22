package P02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power=Integer.parseInt(scanner.nextLine());
        int distance=Integer.parseInt(scanner.nextLine());
        int factor=Integer.parseInt(scanner.nextLine());
        int pokeCount=0;
        int startingPower=power;




        while (power>=distance){

            power=power-distance;
            pokeCount++;

            if (power==startingPower/2){
                if (factor!=0){
                    power=power/factor;
                }

            }
        }
        System.out.println(power);
        System.out.println(pokeCount);

    }
}
