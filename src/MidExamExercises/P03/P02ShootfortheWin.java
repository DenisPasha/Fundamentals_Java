package MidExamExercises.P03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShootfortheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>inputList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command=scanner.nextLine();

        while (!command.equals("End")){

            int shot= Integer.parseInt(command);

            //looping through list and shooting the target
            for (int i = 0; i < inputList.size(); i++) {
                int currentNum= inputList.get(i);
                int current=currentNum;

                //finding the target
                if (i==shot){

                    //check if target is already shot
                    if (currentNum!=-1){
                        currentNum=-1;
                        inputList.set(i,currentNum);
                    }

                    //increasing or decreasing other numbers
                    for (int j = 0; j < inputList.size(); j++) {
                        int currentNum2= inputList.get(j);

                        //check if num is shot
                        if (currentNum2!=-1){

                            //increasing with its value
                            if (currentNum2 > current){
                                currentNum2=currentNum2-current;
                                inputList.set(j,currentNum2);
                                //decreasing with its value
                            }else {
                                currentNum2=currentNum2+current;
                                inputList.set(j,currentNum2);
                            }
                        }



                    }
                }
            }



            command=scanner.nextLine();
        }

        int shotCount=0;
        for (int i = 0; i < inputList.size(); i++) {
            int current=inputList.get(i);
            if (current==-1){
                shotCount++;
            }
        }
        System.out.printf("Shot targets: %d -> ",shotCount);
        for (int item:inputList) {
            System.out.print(item+" ");
        }
    }
}
