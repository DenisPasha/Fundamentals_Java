package P01BasicSyntaxConditionalStatementsandLoops.Exercices;

import java.util.Scanner;

public class P01Ages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age= Integer.parseInt(scanner.nextLine());
        String type="";

        if (age<=2){
            type="baby";
        } else if (age<=13) {
            type="child";
        } else if (age<=19) {
            type="teenager";
        } else if (age<=65) {
            type="adult";
        }else {
            type="elder";
        }

        System.out.printf("%s",type);


    }
}
