package P08TextProcessing.lab;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text=scanner.nextLine();
        StringBuilder reversed=new StringBuilder();

        while (!text.equals("end")){

            for (int i = text.length()-1; i >= 0; i--) {
                char currentSymbol=text.charAt(i);
                reversed.append(currentSymbol);
            }
            System.out.printf("%s = %s%n",text,reversed);
            reversed.delete(0,reversed.length());

            text=scanner.nextLine();
        }
    }
}
