package MidExam;

import java.util.Scanner;

public class P01BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCities=Integer.parseInt(scanner.nextLine());


        double totalProfit=0;

        for (int i = 1; i <=numOfCities ; i++) {

            String city=scanner.nextLine();
            double earnedMoney=Double.parseDouble(scanner.nextLine());
            double expenses=Double.parseDouble(scanner.nextLine());

            double profitForEach = 0;
            boolean noSpecialEvent=false;
            if (i % 5==0){
                profitForEach=earnedMoney - earnedMoney*0.10 - expenses;
                totalProfit= totalProfit+ profitForEach;
                noSpecialEvent=true;

            } else if (i % 3==0 ) {

                if (!noSpecialEvent){
                    expenses=expenses + expenses*0.5;
                    profitForEach=earnedMoney - expenses;
                    totalProfit= totalProfit+ profitForEach;
                }

            }else {
                profitForEach=earnedMoney - expenses;
                totalProfit= totalProfit+ profitForEach;
            }


            System.out.printf("In %s Burger Bus earned %.2f leva.%n",city,profitForEach);

        }
        System.out.printf("Burger Bus total profit: %.2f leva.",totalProfit);
    }
}
