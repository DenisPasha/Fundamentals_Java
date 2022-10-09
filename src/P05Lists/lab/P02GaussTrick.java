package P05Lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>inputList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        printNewList(inputList);


    }

    private static void printNewList(List<Integer> inputList){

        int listSize=inputList.size();

        for (int i = 0; i < listSize/2; i++) {

            int fNum=inputList.get(i);
            int lNum=inputList.get(inputList.size()-1);
            int res=fNum+lNum;

            inputList.set(i,res);
            inputList.remove(inputList.size()-1);

        }

        for (int item:inputList) {
            System.out.print(item+" ");
        }

    }
}
