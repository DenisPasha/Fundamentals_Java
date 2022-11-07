package P08TextProcessing.Exercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        StringBuilder newText=new StringBuilder(input);

        for (int i = 0; i < newText.length(); i++) {

            if (i==newText.length()-1){
                break;
            }
            char currentChar=newText.charAt(i);
            char nextChar=newText.charAt(i+1);

            if (currentChar==nextChar){
                newText.deleteCharAt(i+1);
                i--;
            }
        }
        System.out.println(newText);

    }
}
