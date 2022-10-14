package P05Lists.Excercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String>inputList= Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command=scanner.nextLine();





        while (!command.contains("3:1")){

            List<String>commandList= List.of(command.split(" "));

            if (command.contains("merge")){
                int startIndex= Integer.parseInt(commandList.get(1));
                int endIndex= Integer.parseInt(commandList.get(2));

                if (startIndex<0){
                    startIndex=0;
                }
                if (endIndex>inputList.size()-1){
                    endIndex=inputList.size()-1;
                }

                boolean isValidIndex=false;
                if (startIndex<= inputList.size()-1 && endIndex>=0 ){
                    isValidIndex=true;
                }

                if (isValidIndex){
                    String concat="";

                    for (int i = startIndex; i <= endIndex; i++) {
                        String currentElement=inputList.get(i);
                        concat=concat+currentElement;

                    }
                    for (int i = startIndex; i <=endIndex ; i++) {
                        inputList.remove(startIndex);
                    }
                    inputList.add(startIndex,concat);
                }


            } else if (command.contains("divide")) {

                int index= Integer.parseInt(commandList.get(1));
                int parts= Integer.parseInt(commandList.get(2));

                String elementForDivide=inputList.get(index);
                List<String>element= List.of(elementForDivide.split(""));

                if (parts<element.size()){

                    inputList.remove(index);
                    int partSize=element.size()/parts;

                    int beginIndexOfInput=0;
                    for (int i = 1; i < parts ; i++) {
                        inputList.add(index,elementForDivide.substring(beginIndexOfInput,beginIndexOfInput+partSize));
                        index++;
                        beginIndexOfInput+=partSize;
                    }
                    inputList.add(index,elementForDivide.substring(beginIndexOfInput));


                }


            }

            command=scanner.nextLine();
        }
        for (String item:inputList) {
            System.out.print(item+" ");
        }
    }
}