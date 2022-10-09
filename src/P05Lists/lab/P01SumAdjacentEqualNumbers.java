package P05Lists.lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double>inputList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        List<Double>newList=result(inputList);
        newList=result(inputList);

        DecimalFormat df=new DecimalFormat("0.#");



        for (double item:newList) {

            System.out.print(df.format(item)+" ");
        }

    }


    private static List<Double> result(List<Double> inputList){

        for (int i = 0; i < inputList.size()-1; i++) {

            if (inputList.get(i).equals(inputList.get(i+1))){
              inputList.set(i,inputList.get(i)+inputList.get(i+1));
              inputList.remove(i+1);
              i=-1;
            }
        }

        return inputList;
    }
}
