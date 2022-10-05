package P04Methods.Exercise;

import java.util.Scanner;

public class P03CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a =scanner.nextLine().charAt(0);
        char b=scanner.nextLine().charAt(0);
        printCharInBetween(a,b);

    }

    private static void printCharInBetween(char a, char b){

        int start=0;
        int end=0;

        if (a<b){
            start=a;
            end=b;
        }else {
            start=b;
            end=a;
        }

        for (int i =start+1 ; i <end ; i++) {
            System.out.printf("%c ",i);
        }

    }
}
