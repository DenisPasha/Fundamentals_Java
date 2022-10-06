package P04Methods.Exercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        printChars(input);

    }

    private static void printChars(String input){

        int print= input.length();

        if (print%2==0){
            char ch1=input.charAt(input.length()/2);
            char ch2=input.charAt(input.length()/2-1);
            System.out.println(ch2+""+ch1);
        }else {
            char ch=input.charAt(input.length()/2) ;
            System.out.println(ch);
        }


    }
}
