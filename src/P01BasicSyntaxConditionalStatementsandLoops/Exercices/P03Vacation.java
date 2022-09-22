package P01BasicSyntaxConditionalStatementsandLoops.Exercices;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {



        Scanner scanner= new Scanner(System.in);

        int peopleCount= Integer.parseInt(scanner.nextLine());
        String group=scanner.nextLine();
        String day=scanner.nextLine();
        double price= 0;


        if (group.equals("Students")){

            if (day.equals("Friday")){
             price=8.45;
            } else if (day.equals("Saturday")) {
                price=9.80;
            } else if (day.equals("Sunday")) {
                price=10.46;
            }
        }else if (group.equals("Business")){

            if (day.equals("Friday")){
                price=10.90;
            } else if (day.equals("Saturday")) {
                price=15.60;
            } else if (day.equals("Sunday")) {
                price=16.00;
            }
        } else if (group.equals("Regular")) {
            if (day.equals("Friday")){
                price=15.00;
            } else if (day.equals("Saturday")) {
                price=20.00;
            } else if (day.equals("Sunday")) {
                price=22.50;
            }
        }

        double total=peopleCount*price;

        if (group.equals("Students")&& peopleCount>=30){
            total=total-(total*0.15);
        } else if (group.equals("Business")&& peopleCount>=100) {
            total=total-total*0.10;
        }else if (group.equals("Regular")&& peopleCount>=10 && peopleCount<=20){
            total=total-total*0.05;
        }

        System.out.printf("Total price: %.2f",total);

    }
}
