package BasicSyntaxConditionalStatementsandLoops.lab;

import java.util.Locale;
import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        String dayType=scanner.nextLine().toLowerCase(Locale.ROOT);
        int age= Integer.parseInt(scanner.nextLine());
        int price=0;

        if (dayType.equals("weekday")){
            if (age<=18){
                price=12;
            } else if (age<=64) {
                price=18;
            }else if (age<=122){
                price=12;
            }
        } else if (dayType.equals("weekend")) {

            if (age<=18){
                price=15;
            } else if (age<=64) {
                price=20;
            }else if (age<=122){
                price=15;
            }
        }else if (dayType.equals("holiday")){


            if (age<=18){
                price=5;
            } else if (age<=64) {
                price=12;
            }else if (age<=122){
                price=10;
            }
        }


        if (price!=0){
            if (age>0){
                System.out.printf("%d$",price);
            }else {
                System.out.println("Error!");
            }
        }


    }
}
