package MidExamExercises;

import java.util.*;
import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>inputArr= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumOfAll=0;
        int arrLength=inputArr.size();

        List<Integer>aboveAverage=new ArrayList<>();
        List<Integer>aboveAverageReversed=new ArrayList<>();
        List<Integer>topFive=new ArrayList<>();

        for (int i = 0; i < inputArr.size(); i++) {
            int currentNum=inputArr.get(i);
            sumOfAll+=currentNum;
        }
        double average=sumOfAll*1.0/arrLength;

        for (int i = 0; i < inputArr.size(); i++) {
            int currentNum=inputArr.get(i);
            if (currentNum>average){
                aboveAverage.add(currentNum);
            }
        }

        Collections.sort(aboveAverage);

        Collections.reverse(aboveAverage);

        if (aboveAverage.size()<5 ){
            for (int i = 0; i <aboveAverage.size() ; i++) {
                topFive.add(aboveAverage.get(i));
            }
        }else {
            for (int i = 0; i <5 ; i++) {
                topFive.add(aboveAverage.get(i));
            }
        }


        if (topFive.size()==0){
            System.out.println("No");
        }else {
            for (int item:topFive) {
                System.out.print(item+" ");
            }
        }

    }
}
