package P04Methods.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1=scanner.nextLine();
        String input=input1.toLowerCase();
        printVowelsCount(input);

    }
    private static void printVowelsCount(String text){

        char[] inputArr=text.toCharArray();

        int counter=0;
        for (char symbol:inputArr) {
            if (symbol=='a' || symbol=='e' || symbol=='i' || symbol=='o'||symbol=='u'){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
