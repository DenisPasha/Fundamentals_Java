package P07AssociativeArrays.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Integer> mapQuantity = new LinkedHashMap<>();
        Map<String, Double> mapPrice = new LinkedHashMap<>();
        Map<String, Double> mapFinal = new LinkedHashMap<>();


        while (!command.equals("buy")) {

            String product = command.split(" ")[0];
            double price = Double.parseDouble(command.split(" ")[1]);
            int quantity = Integer.parseInt(command.split(" ")[2]);

            //quantity maps filling
            mapQuantity.putIfAbsent(product, 0);
            mapQuantity.put(product, mapQuantity.get(product) + quantity);

            //price map filling
            mapPrice.put(product, price);


            command = scanner.nextLine();
        }

        boolean isEnough=false;
        for (Map.Entry<String, Integer> entry : mapQuantity.entrySet()) {

            for (Map.Entry<String, Double> doubleEntry : mapPrice.entrySet()) {
                double sum=0;
                if (doubleEntry.getKey().equals(entry.getKey())){
                     sum = entry.getValue() * doubleEntry.getValue();
                    mapFinal.putIfAbsent(entry.getKey(), sum);
                }




            }

        }

        mapFinal.entrySet().forEach(stringDoubleEntry -> System.out.printf("%s -> %.2f%n",stringDoubleEntry.getKey(),stringDoubleEntry.getValue()));
    }
}
