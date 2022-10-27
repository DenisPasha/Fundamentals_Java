package P07AssociativeArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double []inputArr= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double,Integer>numbersMap=new TreeMap<>();

        for (int i = 0; i < inputArr.length; i++) {
            double currentNum=inputArr[i];

            if (!numbersMap.containsKey(currentNum)){
                numbersMap.put(currentNum,1);
            }else {
                numbersMap.put(currentNum,numbersMap.get(currentNum)+1);
            }

        }

        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            System.out.printf("%.0f -> %d",entry.getKey(), entry.getValue());
            System.out.println();
        }


    }
}
