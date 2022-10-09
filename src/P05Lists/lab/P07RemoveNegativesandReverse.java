package P05Lists.lab;

import java.util.*;
import java.util.stream.Collectors;

public class P07RemoveNegativesandReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < inputList.size(); i++) {
            int currentNum=inputList.get(i);
            if (currentNum<0){
                inputList.remove(i);
                i=i-1;
            }

        }

        if (inputList.size()==0){
            System.out.printf("empty");
        }else {

            Collections.reverse(inputList);
            for (int item:inputList) {
                System.out.print(item+" ");
            }
        }
    }
}
