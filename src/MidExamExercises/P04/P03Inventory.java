package MidExamExercises.P04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>inputList= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command=scanner.nextLine();
        while (!command.equals("Craft!")){

            List<String>commandList= List.of(command.split(" "));

            if (commandList.get(0).equals("Collect")){
                String item=commandList.get(2);
                boolean doesNotExist=true;
                for (int i = 0; i < inputList.size(); i++) {
                    String currentItem=inputList.get(i);

                    if (currentItem.equals(item)){
                        doesNotExist=false;
                    }
                }
                if (doesNotExist) {
                    inputList.add(item);
                }
                
            } else if (commandList.get(0).equals("Drop")) {

                String item=commandList.get(2);

                for (int i = 0; i < inputList.size(); i++) {
                    String currentItem=inputList.get(i);

                    if (currentItem.equals(item)){
                        inputList.remove(i);
                    }
                }

            } else if (commandList.get(0).equals("Combine")) {

                String item=commandList.get(3);
                List<String>combineList= List.of(item.split(":"));

                String oldItem=combineList.get(0);
                String newItem=combineList.get(1);

                for (int i = 0; i < inputList.size(); i++) {
                    String currentItem=inputList.get(i);

                    if (currentItem.equals(oldItem)){
                        inputList.add(i+1,newItem);
                    }
                }

            } else if (commandList.get(0).equals("Renew")) {
                String item=commandList.get(2);

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
            System.out.print(inputList.get(i)+", ");
        }
        for (int i = inputList.size()-1; i < inputList.size() ; i++) {
            System.out.print(inputList.get(i));
        }

    }
}
