package P09Regex.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        double totalMoney=0;

        while (!command.equals("end of shift")){

            String regex="%(?<costomerName>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
            Pattern pattern= Pattern.compile(regex);
            Matcher matcher= pattern.matcher(command);

            while (matcher.find()){
                String costumerName=matcher.group("costomerName");
                String product=matcher.group("product");
                int count= Integer.parseInt(matcher.group("count"));
                double price= Double.parseDouble(matcher.group("price"));

                //George: Croissant - 20.60

                System.out.printf("%s: %s - %.2f%n",costumerName,product,count*price);
                totalMoney+=price*count;
            }
            command=scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalMoney);
    }
}
