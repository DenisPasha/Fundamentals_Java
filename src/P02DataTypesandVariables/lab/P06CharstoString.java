package P02DataTypesandVariables.lab;

import java.util.Scanner;

public class P06CharstoString {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);


        char a=scanner.nextLine().charAt(0);
        char b=scanner.nextLine().charAt(0);
        char c=scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c",a,b,c);

    }
}
