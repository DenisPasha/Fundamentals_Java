package P02DataTypesandVariables.lab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wanted = Integer.parseInt(scanner.nextLine());
        int total = 0;
        String True="True";
        String False="False";



        for (int i = 1; i <= wanted; i++) {
          int num = i;
            while (i > 0) {
                total += i % 10;
                i = i / 10;
            }
        if(total == 5 || total==7 || total==11){
            System.out.printf("%d -> %s%n", num, True);
            }else {
            System.out.printf("%d -> %s%n", num, False);
        }





            total = 0;
            i = num;
        }




    }
}
