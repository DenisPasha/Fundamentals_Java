package P05Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>inputList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> specialNumbers=Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int bomb= specialNumbers.get(0);
        int power= specialNumbers.get(1);
        int counter=0;


        for (int i = 0; i < inputList.size(); i++) {
            int currentNum=inputList.get(i);

            if (currentNum==bomb){

                if (power==1){
                    counter++;
                    for (int j = 1; j <=power ; j++) {
                        if (inputList.size()>=i+1){
                            inputList.remove(i+1);
                        }
                    }
                    for (int j = 1; j <=power ; j++) {
                        if (inputList.size()>=i+1){
                            inputList.remove(i-1);
                        }
                    }

                } else if (power==2) {
                    counter++;
                    for (int j = 1; j <=power ; j++) {
                        if (inputList.size()>=i+1){
                            inputList.remove(i+1);
                        }
                    }
                    for (int j = 1; j <=power ; j++) {
                        if (inputList.size()>=i-1){
                            inputList.remove(i-1);
                            i-=1;
                        }
                    }

                } else if (power==3) {
                    counter++;
                    int listSize=inputList.size();

                    for (int j = 1; j <=power ; j++) {
                        if (inputList.size()>i+1){
                            inputList.remove(i+1);
                        }
                    }

                    for (int j = 1; j <=power ; j++) {
                        if (inputList.size()>=i-1){
                            inputList.remove(i-1);
                            i-=1;
                        }
                    }
                }

            }
        }

        int sum=0;
        for (int i = 0; i < inputList.size(); i++) {
            int currentNum=inputList.get(i);
            sum+=currentNum;
        }
        System.out.println(sum-bomb*counter);

    }
}
