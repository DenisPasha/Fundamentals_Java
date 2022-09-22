package P01BasicSyntaxConditionalStatementsandLoops.lab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int hours= Integer.parseInt(scanner.nextLine());
        int min= Integer.parseInt(scanner.nextLine());

        int totalMin=min+30;

        if (totalMin>60){
            hours++;
            totalMin-=60;

        }


        if (hours>23){
            hours=0;
        }

        if (totalMin<10){
            System.out.printf("%d:0%d",hours,totalMin);
        }else {
            System.out.printf("%d:%d",hours,totalMin);
        }



    }
}
