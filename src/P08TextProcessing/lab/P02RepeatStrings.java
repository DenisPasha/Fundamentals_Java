package P08TextProcessing.lab;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr=scanner.nextLine().split(" ");
        StringBuilder appended=new StringBuilder();
        for (int i = 0; i < inputArr.length; i++) {
            String currentWord=inputArr[i];

            for (int j = 0; j < currentWord.length(); j++) {
                appended.append(currentWord);
            }
        }

        System.out.println(appended);
    }
}
