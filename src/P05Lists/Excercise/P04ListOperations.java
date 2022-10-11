package P05Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<Integer>inputList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commandInput=scanner.nextLine();
        while (!commandInput.contains("End")){

            List<String>commandList= List.of(commandInput.split(" "));
            if (commandInput.contains("Insert")){

                int number= Integer.parseInt(commandList.get(1));
                int index= Integer.parseInt(commandList.get(2));
                if (index>=0 && index<=inputList.size()-1){
                    inputList.add(index,number);
                }else {
                    System.out.println("Invalid index");
                }

            } else if (commandInput.contains("Remove")) {
                int index= Integer.parseInt(commandList.get(1));
                if (index>=0 &&  index<=inputList.size()-1){
                    inputList.remove(index);
                }else {
                    System.out.println("Invalid index");
                }

            } else if (commandInput.contains("Shift")&& commandInput.contains("left")) {
                int count= Integer.parseInt(commandList.get(2));

                for (int i = 1; i <= count; i++) {
                    int fElement=0;
                    fElement=inputList.get(0);
                    for (int j = 0; j < inputList.size()-1; j++) {
                        inputList.set(j,inputList.get(j+1));
                    }
                    inputList.set(inputList.size()-1,fElement);
                }

            } else if (commandInput.contains("Shift")&& commandInput.contains("right")) {

                int count= Integer.parseInt(commandList.get(2));

                for (int i = 1; i <=count ; i++) {

                   int lastElement=inputList.get(inputList.size()-1);
                    for (int j = inputList.size()-1; j >= 1; j--) {
                        inputList.set(j,inputList.get(j-1));
                    }
                    inputList.set(0,lastElement);
                }

            } else if (commandInput.contains("Add")) {
                int number= Integer.parseInt(commandList.get(1));
                inputList.add(number);
            }


            commandInput=scanner.nextLine();
        }
        for (int element:inputList) {
            System.out.print(element+" ");
        }
    }
}
