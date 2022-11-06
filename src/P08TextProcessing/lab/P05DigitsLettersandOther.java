package P08TextProcessing.lab;

import java.util.Scanner;

public class P05DigitsLettersandOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        StringBuilder digit=new StringBuilder();
        StringBuilder letters=new StringBuilder();
        StringBuilder symbols=new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar=text.charAt(i);

            if (Character.isDigit(currentChar)){
                digit.append(currentChar);
            } else if (Character.isLetter(currentChar)) {
                letters.append(currentChar);
            }else {
                symbols.append(currentChar);
            }

        }
        System.out.println(digit);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
