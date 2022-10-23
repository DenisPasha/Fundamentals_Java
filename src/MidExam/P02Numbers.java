package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>inputList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command=scanner.nextLine();

        while (!command.equals("Finish")){

            List<String>commandList= List.of(command.split(" "));

            String currentCommand=commandList.get(0);
            int value= Integer.parseInt(commandList.get(1));

            if (currentCommand.equals("Add")){
                inputList.add(value);
            } else if (currentCommand.equals("Remove")) {

                for (int i = 0; i < inputList.size(); i++) {
                    int currentNum=inputList.get(i);

                    if (currentNum==value){
                        inputList.remove(i);
                    }
                }
            } else if (currentCommand.equals("Replace")) {

                int replacement= Integer.parseInt(commandList.get(2));
                for (int i = 0; i < inputList.size(); i++) {
                    int currentNum=inputList.get(i);

                    if (currentNum==value){
                        inputList.set(i,replacement);
                        break;
                    }

                }
            }
            else if (currentCommand.equals("Collapse")) {
                for (int i = 0; i < inputList.size(); i++) {
                    int currentNum=inputList.get(i);

                    if (currentNum < value){
                        inputList.remove(i);
                        i--;
                    }
                }
            }


            command=scanner.nextLine();
        }

        for (int item:inputList) {
            System.out.print(item+" ");
        }
    }
}
