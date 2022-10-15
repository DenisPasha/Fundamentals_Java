package P05Lists.MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class P04MixedupLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>firstList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer>secondList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer>reversedList=new ArrayList<>();

        List<Integer>newList=new ArrayList<>();

        List<Integer>lastList=new ArrayList<>();
        for (int i = secondList.size()-1; i >=0 ; i--) {
            reversedList.add(secondList.get(i));
        }


        List<Integer>combinedList=new ArrayList<>();

        boolean secondIsBigger=false;
        if (firstList.size() > secondList.size()){
            secondIsBigger=true;
        }
        if (secondIsBigger){
            for (int i = 0; i < reversedList.size(); i++) {

                int currentNumber=firstList.get(i);
                int number2=reversedList.get(i);

                combinedList.add(currentNumber);
                combinedList.add(number2);
            }
            int num1=firstList.get(firstList.size()-2);
            int num2=firstList.get(firstList.size()-1);

            if (num1 > num2){
                int tempNum=num1;
                num1=num2;
                num2=tempNum;
            }

            for (int i = 0; i < combinedList.size(); i++) {
                int currentNum=combinedList.get(i);
                if (currentNum > num1 && currentNum <num2){
                    lastList.add(currentNum);
                }
            }
            Collections.sort(lastList);
            for (int item:lastList) {
                System.out.print(item+" ");
            }

        }else {
            for (int i = 0; i < firstList.size(); i++) {

                int currentNumber=reversedList.get(i);
                int number2=firstList.get(i);

                combinedList.add(currentNumber);
                combinedList.add(number2);
            }
            int num1=reversedList.get(reversedList.size()-2);
            int num2=reversedList.get(reversedList.size()-1);

            if (num1 > num2){
                int tempNum=num1;
                num1=num2;
                num2=tempNum;
            }

            for (int i = 0; i < combinedList.size(); i++) {
                int currentNum=combinedList.get(i);
                if (currentNum > num1 && currentNum <num2){
                    lastList.add(currentNum);
                }
            }
            Collections.sort(lastList);
            for (int item:lastList) {
                System.out.print(item+" ");
            }
        }



    }

}
