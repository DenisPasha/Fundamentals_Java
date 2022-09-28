package P03Arrays.Exercises;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String text1=scanner.nextLine();
        String text2=scanner.nextLine();

        String[] fArray=text1.split(" ");
        String[] sArray=text2.split(" ");

        for (int i = 0; i < fArray.length; i++) {

            for (int j = 0; j <sArray.length ; j++) {

                if (fArray[i].equals(sArray[j])){
                    System.out.printf("%s ",fArray[i]);
                }

            }

        }

    }
}
