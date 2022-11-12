package P09Regex.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =  scanner.nextLine();
        double totalMoney=0;
        List<String>furnitureList=new ArrayList<>();

        while (!input.equals("Purchase")){

            String regex=">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+[.]?[0-9]+)!(?<quantity>[0-9]+)";
            Pattern pattern= Pattern.compile(regex);
            Matcher matcher= pattern.matcher(input);

            while (matcher.find()){

                String furniture= matcher.group("furniture");
                double price= Double.parseDouble(matcher.group("price"));
                int quantity= Integer.parseInt(matcher.group("quantity"));

                double totalCurrentPrice=price * quantity;
                totalMoney+=totalCurrentPrice;
                furnitureList.add(furniture);

            }



            input=scanner.nextLine();
        }

        System.out.printf("Bought furniture:%n");
        furnitureList.forEach(furniture -> System.out.printf("%s%n",furniture));
        System.out.printf("Total money spend: %.2f",totalMoney);

    }
}
