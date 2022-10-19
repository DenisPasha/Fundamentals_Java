package MidExamExercises.P06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>inputList= Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command=scanner.nextLine();
        int moves=0;
        boolean gameOver=false;

        while (!command.equals("end")){

            moves++;

            List<String>commandList= List.of(command.split(" "));
            int index1= Integer.parseInt(commandList.get(0));
            int index2= Integer.parseInt(commandList.get(1));

            //checking if indexes are in bounds and valid
            if (index1 >=0 && index1 <inputList.size() && index2 >=0 && index2 <= inputList.size() && index1!=index2){
                //if elements are same
                if (inputList.get(index1).equals(inputList.get(index2))){
                    String element=inputList.get(index1);
                    System.out.printf("Congrats! You have found matching elements - %s!",element);
                    System.out.println();
                    inputList.remove(index1);
                    if (index2-1>=0){
                        inputList.remove(index2-1);
                    }else {
                        inputList.remove(index2);
                    }


                } else{
                    System.out.println("Try again!");

                }

            }else {

                int indexToAdd=inputList.size()/2;

                String element=-moves+"a";
                inputList.add(indexToAdd,element);
                inputList.add(indexToAdd+1,element);
                System.out.println("Invalid input! Adding additional elements to the board");


            }


           if (inputList.size()==0){
               System.out.printf("You have won in %d turns!",moves);
               System.out.println();
               gameOver=true;
               break;

           }

            command=scanner.nextLine();
        }
        if (!gameOver){
            if (inputList.size()>0){
                System.out.println("Sorry you lose :(");
                for (String item:inputList) {
                    System.out.print(item+" ");
                }
            }
        }

    }
}
