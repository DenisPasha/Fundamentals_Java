package P05Lists.MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer>inputList=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int listLength= inputList.size();

        List<Integer>leftCarList=inputList.subList(0,listLength/2);
        List<Integer>rightCarList=inputList.subList(listLength/2+1,listLength);

        double  leftCarSum=0;
        double  rightCarSum=0;

        for (int i = 0; i < leftCarList.size(); i++) {
            int currentNum=leftCarList.get(i);

            if (currentNum!=0){
                leftCarSum+=currentNum;
            }else {
                leftCarSum=leftCarSum-leftCarSum*0.20;
            }

        }

        for (int k = rightCarList.size()-1; k >=0 ; k--) {
            int currentNum=rightCarList.get(k);

            if (currentNum!=0){
                rightCarSum+=currentNum;
            }else {
                rightCarSum=rightCarSum-rightCarSum*0.20;
            }

        }
        if (leftCarSum < rightCarSum){
            System.out.printf("The winner is left with total time: %.1f",leftCarSum);
        }else {
            System.out.printf("The winner is right with total time: %.1f",rightCarSum);
        }
    }
}
