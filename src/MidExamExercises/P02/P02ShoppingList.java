package MidExamExercises.P02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>inputList= Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String command=scanner.nextLine();

        while (!command.equals("Go Shopping!")){

            List<String>commandList= List.of(command.split(" "));

            if (commandList.get(0).equals("Urgent")){
                String item=commandList.get(1);
                boolean alreadyExist=false;
                for (int i = 0; i < inputList.size(); i++) {
                    String currentItem=inputList.get(i);
                    if (currentItem.equals(item)){
                        alreadyExist=true;
                    }
                }
                if (!alreadyExist){
                    inputList.add(0,item);
                }
            } else if (commandList.get(0).equals("Unnecessary")) {
                String item=commandList.get(1);
                boolean doesNotExist=true;
                for (int i = 0; i < inputList.size(); i++) {
                    String currentItem=inputList.get(i);
                    if (currentItem.equals(item)){
                        doesNotExist=false;
                    }
                }
                if (!doesNotExist){
                    for (int i = 0; i < inputList.size(); i++) {
                        String currentItem=inputList.get(i);
                        if (currentItem.equals(item)){
                            inputList.remove(i);
                        }
                    }
                }

            } else if (commandList.get(0).equals("Correct")) {
                String oldItem=commandList.get(1);
                String newItem=commandList.get(2);

                for (int i = 0; i < inputList.size(); i++) {
                    String currentItem=inputList.get(i);
                    if (currentItem.equals(oldItem)){
                        inputList.set(i,newItem);
                    }
                }

            } else if (commandList.get(0).equals("Rearrange")) {
                String item=commandList.get(1);

                for (int i = 0; i < inputList.size(); i++) {
                    String currentItem=inputList.get(i);
                    if (currentItem.equals(item)){
                        inputList.remove(i);
                        inputList.add(item);
                    }
                }
            }


            command=scanner.nextLine();
        }

        for (int i = 0; i < inputList.size()-1; i++) {
            String currentItem=inputList.get(i);
            System.out.print(currentItem+", ");
        }

        for (int i = inputList.size()-1; i <inputList.size() ; i++) {
            String currentItem=inputList.get(i);
            System.out.print(currentItem);
        }
    }
}
