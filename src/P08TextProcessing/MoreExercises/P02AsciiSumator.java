package P08TextProcessing.MoreExercises;

import java.util.Scanner;

public class P02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstCharInput=scanner.nextLine();
        char firstChar=firstCharInput.charAt(0);

        String secondCharInput=scanner.nextLine();
        char secondChar=secondCharInput.charAt(0);

        String text=scanner.nextLine();
        int sum=0;

        for (int i = 0; i <text.length() ; i++) {
            char currentChar=text.charAt(i);

            if (currentChar >= firstChar && currentChar < secondChar){
                sum+=currentChar;
            }
        }
        System.out.println(sum);
    }
}
