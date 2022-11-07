package P08TextProcessing.Exercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        StringBuilder crypted=new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol=input.charAt(i);

            char newSymbol= (char) (currentSymbol+3);
            crypted.append(newSymbol);

        }
        System.out.println(crypted);
    }
}
