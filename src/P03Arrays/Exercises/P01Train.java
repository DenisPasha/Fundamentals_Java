package P03Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int sum=0;
        int[]peoples=new int[n];

        for (int i = 0; i <n ; i++) {

            int peopleCount=Integer.parseInt(scanner.nextLine());
            sum+=peopleCount;

            for (int j = 0; j <peoples.length ; j++) {

                peoples[i]=peopleCount;
            }


        }
        for (int l = 0; l <peoples.length ; l++) {
            System.out.print(peoples[l]+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
