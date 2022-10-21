package MidExamExercises.P06;

import java.util.Arrays;
import java.util.Scanner;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting=Integer.parseInt(scanner.nextLine());
        int[]wagonArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < wagonArr.length ; i++) {

            int currentWagon=wagonArr[i];

            //modifying the wagon
            for (int j = 1; j <= peopleWaiting ; j++) {
                while (currentWagon < 4){
                    if (peopleWaiting > 0){
                        currentWagon++;
                        peopleWaiting--;
                    }else {
                        break;
                    }

                }
            }
            //updating the wagon
            wagonArr[i]=currentWagon;

        }

        //checking for empty spots
        int emptySpots=0;
        for (int i = 0; i < wagonArr.length; i++) {
            int currentWagon=wagonArr[i];

            for (int j = 1; j <=currentWagon ; j++) {
                if(currentWagon!=4){
                    emptySpots++;
                }

            }
        }
        
        //if no people waiting and empty spot available
        if (peopleWaiting == 0 && emptySpots > 0){
            System.out.println("The lift has empty spots!");
            for (int item:wagonArr) {
                System.out.print(item+" ");
            }
            //if people waiting and lift full
        } else if (peopleWaiting > 0 ) {
            System.out.printf("There isn't enough space! %d people in a queue!",peopleWaiting);
            System.out.println();
            for (int item:wagonArr) {
                System.out.print(item+" ");
            }
        } else if (peopleWaiting ==0 && emptySpots ==0){

            for (int item:wagonArr) {
                System.out.print(item+" ");
            }
        }

    }
}
