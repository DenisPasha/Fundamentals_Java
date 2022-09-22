package P02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class P11SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        double highestValue=Double.MIN_VALUE;
        int currentSnow=0;
        int currentTime=0;
        int currentQuality=0;


        for (int i = 1; i <=n ; i++) {

            int snow=Integer.parseInt(scanner.nextLine());
            int time=Integer.parseInt(scanner.nextLine());
            int quality=Integer.parseInt(scanner.nextLine());


            double value= Math.pow((snow*1.0)/time,quality);

            if (value>highestValue){
                highestValue=value;
                currentSnow=snow;
                currentTime=time;
                currentQuality=quality;


            }

        }

        System.out.printf("%d : %d = %.0f (%d)",currentSnow,currentTime,highestValue,currentQuality);


    }
}
