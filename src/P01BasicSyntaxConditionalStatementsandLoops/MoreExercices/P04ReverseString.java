package P01BasicSyntaxConditionalStatementsandLoops.MoreExercices;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        String comand=scanner.nextLine();
        String reversed="";
        char ch;

        for (int i=0; i<comand.length(); i++){
            ch=comand.charAt(i);
            reversed=ch+reversed;

        }
        System.out.println(reversed);


    }
}
