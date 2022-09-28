package P03Arrays.Exercises;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        String[] arr1=new String[n];
        String[] arr2=new String[n];
        int counter=0;

        String[]num=new String[1];


        for (int i = 0; i <n ; i++) {



             String numS=scanner.nextLine();
             num=numS.split(" ");
             counter++;

             if (i % 2==0){
                 arr1[i]=num[0];
                 arr2[i]=num[1];
             }else {
                 arr2[i]=num[0];
                 arr1[i]=num[1];
             }

        }

        for (int k = 0; k <arr1.length ; k++) {
            System.out.print(arr1[k]+" ");
        }
        System.out.println();

        for (int l = 0; l < arr2.length; l++) {
            System.out.print(arr2[l]+" ");
        }



    }
}
