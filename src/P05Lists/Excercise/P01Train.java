package P05Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer>inputList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity=Integer.parseInt(scanner.nextLine());
        String command=scanner.nextLine();
        List<String>commandList= List.of(command.split(" "));


        while (!commandList.get(0).equals("end")){

            if (commandList.get(0).equals("Add")){
                inputList.add(Integer.valueOf(commandList.get(1)));
            }else {
                int numToAdd= Integer.parseInt(commandList.get(0));
                for (int i = 0; i < inputList.size(); i++) {

                    int currentNum=inputList.get(i);
                    if (currentNum+numToAdd<=maxCapacity){
                        inputList.set(i,currentNum+numToAdd);
                        break;
                    }
                }
            }



            commandList= List.of(scanner.nextLine().split(" "));
        }
        for (int element:inputList) {
            System.out.print(element+" ");
        }


    }

}
