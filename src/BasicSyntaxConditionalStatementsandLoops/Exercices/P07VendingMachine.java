package BasicSyntaxConditionalStatementsandLoops.Exercices;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String userInput=scanner.nextLine();
        double coinsTotal=0;
        double price=0;


        while (!userInput.equals("Start")){

            double currentCoin= Double.parseDouble(userInput);

            if (currentCoin==0.1||currentCoin==0.2||currentCoin==0.5||currentCoin==1||currentCoin==2){
                coinsTotal=coinsTotal+currentCoin;
            }else {
                System.out.printf("Cannot accept %.2f",currentCoin);
                System.out.println();

            }

            userInput=scanner.nextLine();


        }
        String product=scanner.nextLine();
        while (!product.equals("End")){


            if (product.equals("Nuts")){
                if (coinsTotal>=2 && coinsTotal>=price){
                    price=price+2;
                    coinsTotal=coinsTotal-2.00;
                    System.out.println("Purchased Nuts");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Water")) {
                if (coinsTotal>=0.70 && coinsTotal>=price){
                    price=price+0.70;
                    coinsTotal=coinsTotal-0.70;
                    System.out.println("Purchased Water");
                }else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (product.equals("Crisps")) {

                if (coinsTotal>=1.50 && coinsTotal>=price){
                    price=price+1.50;
                    coinsTotal=coinsTotal-1.50;
                    System.out.println("Purchased Crisps");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Soda")) {

                if (coinsTotal>=0.80 && coinsTotal>=price){
                    price=price+0.80;
                    coinsTotal=coinsTotal-0.80;
                    System.out.println("Purchased Soda");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Coke")) {

                if (coinsTotal>=1.00 && coinsTotal>=price){
                    price=price+1.00;
                    coinsTotal=coinsTotal-1.00;
                    System.out.println("Purchased Coke");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }

            product=scanner.nextLine();
        }

        System.out.printf("Change: %.2f",coinsTotal);


    }
}
