package P03Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04ReverseArrayofStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text=scanner.nextLine();

        String[] array=text.split(" ");

        for (int i = array.length-1; i >= 0 ; i--) {

            System.out.print(array[i]+" ");



        }







    }
}
