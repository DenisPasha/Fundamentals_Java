package P03Arrays.Exercises;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String [] input1=scanner.nextLine().split(" ");
        String [] input2=scanner.nextLine().split(" ");

        for (int i = 0; i < input2.length; i++) {

            for (int j = 0; j < input1.length; j++) {
                if (input1[j].equals(input2[i])){
                    System.out.print(input1[j]+" ");
                    break;
                }
            }


        }

    }
}
