package P04Methods.MoreExercises;

import java.util.Scanner;

public class P04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num=Integer.parseInt(scanner.nextLine());
        printTribonacci(num);


    }

    private static void printTribonacci(int num){

        int[] tribonacciStart=new int[1];
        tribonacciStart[0]=1;

        int[] tribonacciTemp=new int[num];

        for (int i = 0; i < num; i++) {

            if (i>2){
                tribonacciTemp[i]=tribonacciTemp[i-1] + tribonacciTemp[i-2] + tribonacciTemp[i-3];
            }else if (i==2){
                tribonacciTemp[i]=tribonacciTemp[i-1]+tribonacciTemp[i-2];
            } else if (i==1) {
                tribonacciTemp[i]=tribonacciStart[i-1];
            } else if (i==0) {
                tribonacciTemp[i]=1;
            }

        }

        for (int number:tribonacciTemp) {
            System.out.print(number+" ");
        }



    }
}
