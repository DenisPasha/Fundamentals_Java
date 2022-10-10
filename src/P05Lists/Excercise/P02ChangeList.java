package P05Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>inputList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        String command=scanner.nextLine();

        while (!command.contains("end")){
            List<String>commandList= List.of(command.split(" "));
            String inputCommand=commandList.get(0);

           if (inputCommand.equals("Delete")){
               int element= Integer.parseInt(commandList.get(1));
               for (int i = 0; i < inputList.size(); i++) {
                   int currentNum=inputList.get(i);
                   if (currentNum==element){
                       inputList.remove(i);
                       i=i-1;
                   }
               }
           } else if (inputCommand.equals("Insert")) {
               int element= Integer.parseInt(commandList.get(1));
               int index= Integer.parseInt(commandList.get(2));

               inputList.add(index,element);
           }

            command=scanner.nextLine();
        }
        for (int element:inputList) {
            System.out.print(element+" ");
        }
    }
}
