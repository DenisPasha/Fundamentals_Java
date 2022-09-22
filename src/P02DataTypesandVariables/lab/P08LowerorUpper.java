package P02DataTypesandVariables.lab;

import java.util.Scanner;

public class P08LowerorUpper {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
         char a = scanner.nextLine().charAt(0);

         if (Character.isUpperCase(a)){
             System.out.println("upper-case");
         }else {
             System.out.println("lower-case");
         }

    }
}
