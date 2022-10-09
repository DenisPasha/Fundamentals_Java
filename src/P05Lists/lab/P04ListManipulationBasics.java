package P05Lists.lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>inputList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());;

                String command=scanner.nextLine();



                while (!command.contains("end")){

                    List<String>commandList= List.of(command.split(" "));
                    String mainCommand=commandList.get(0);
                    if (command.contains("Add")){

                        int commandNum= Integer.parseInt(commandList.get(1));
                      add(inputList,commandNum);

                    } else if (mainCommand.equals("Remove")) {

                        int commandNum= Integer.parseInt(commandList.get(1));
                        remove(inputList,commandNum);

                    } else if (mainCommand.equals("RemoveAt")) {
                        int commandNum= Integer.parseInt(commandList.get(1));
                        removeAt(inputList,commandNum);

                    } else if (mainCommand.equals("Insert")) {
                        int number= Integer.parseInt(commandList.get(1));
                        int index= Integer.parseInt(commandList.get(2));
                        insert(inputList,number,index);
                    }


                    command=scanner.nextLine();
                }
        for (int item:inputList) {
            System.out.print(item+" ");
        }
    }

    private static List<Integer> add(List<Integer> inputList, int commandNum){

               inputList.add(commandNum);
               return inputList;

    }

    private static List<Integer> remove(List<Integer> inputList,int commandNum){

        inputList.removeIf(integer -> integer==commandNum);
        return inputList;

    }

    private static List<Integer> removeAt(List<Integer> inputList, int command){

        inputList.remove(command);
        return inputList;

    }

    private static List<Integer> insert(List<Integer> inputList,int number, int index){

         inputList.add(index,number);
         return inputList;
    }
}
