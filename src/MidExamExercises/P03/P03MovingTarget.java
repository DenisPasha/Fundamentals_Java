package MidExamExercises.P03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>inputList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command=scanner.nextLine();

        while (!command.equals("End")){

            List<String>commandList= List.of(command.split(" "));

            if (command.contains("Shoot")){

                int index= Integer.parseInt(commandList.get(1));
                int power= Integer.parseInt(commandList.get(2));

                //checking if index is valid and updating or removing
                if (index>=0 && index <inputList.size()){
                    int target=inputList.get(index);

                    if (target<=0){
                        inputList.remove(index);
                    }else {
                        target=target-power;
                        inputList.set(index,target);
                        if (target<=0){
                            inputList.remove(index);
                        }
                    }
                }

            } else if (command.contains("Add")) {
                int index= Integer.parseInt(commandList.get(1));
                int value= Integer.parseInt(commandList.get(2));

                if (index > 0 && index< inputList.size()){
                    inputList.set(index,value);
                }else {
                    System.out.println("Invalid placement!");
                }

            } else if (command.contains("Strike")) {
                int index= Integer.parseInt(commandList.get(1));
                int radius= Integer.parseInt(commandList.get(2));

                if (index-radius > 0 && index+radius <inputList.size()){

                    for (int i = index; i <=radius ; i++) {
                        inputList.remove(i);
                    }
                    for (int i = index+1; i >=radius ; i--) {
                        inputList.remove(i);
                    }


                }else {
                    System.out.println("Strike missed!");
                }

            }


            command=scanner.nextLine();
        }

        for (int i = 0; i < inputList.size()-1; i++) {
            System.out.print(inputList.get(i)+"|");
        }
        for (int i = inputList.size()-1; i <inputList.size() ; i++) {
            System.out.print(inputList.get(i));
        }
    }
}
