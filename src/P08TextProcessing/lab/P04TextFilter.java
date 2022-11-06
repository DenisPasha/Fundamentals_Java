package P08TextProcessing.lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]bannedArr=scanner.nextLine().split(", ");
        String text=scanner.nextLine();

        for (int i = 0; i < bannedArr.length ; i++) {
            String currentBanned=bannedArr[i];

            if (text.contains(currentBanned)){
                StringBuilder replacement=new StringBuilder();
                for (int j = 0; j < currentBanned.length(); j++) {
                     replacement.append("*");
                }
                text=text.replace(currentBanned,replacement);

            }
        }
        System.out.println(text);

    }
}
