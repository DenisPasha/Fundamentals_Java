package P03Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[]inputArray= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();

        int sumLeft=0;
        int sumRight=0;
        boolean notFound=false;
        int number=0;
        
        for (int i = 0; i < inputArray.length; i++) {

            sumLeft=0;
            sumRight=0;
            if (i!=0){

                for (int j = i; j >0 ; j--) {

                    sumLeft=sumLeft+inputArray[j-1];

                }
                for (int k = i+1; k < inputArray.length ; k++) {

                    sumRight=sumRight+inputArray[k];

                }
                if (sumLeft==sumRight){
                    number=i;
                   // System.out.println(i);
                    break;
                }
                
            }

            
        }
        if (sumLeft==sumRight){
            System.out.println(number);
        }else {
            System.out.println("no");
        }


    }
}
