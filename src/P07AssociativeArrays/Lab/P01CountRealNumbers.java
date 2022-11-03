package P07AssociativeArrays.Lab;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Double>inputList=Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        Map<Double,Integer>numsMap=new TreeMap<>();

        for (int i = 0; i < inputList.size(); i++) {
            double currentNum=inputList.get(i);

            numsMap.putIfAbsent(currentNum,0);
            numsMap.put(currentNum,numsMap.get(currentNum)+1);


        }

        for (Map.Entry<Double, Integer> entry : numsMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
