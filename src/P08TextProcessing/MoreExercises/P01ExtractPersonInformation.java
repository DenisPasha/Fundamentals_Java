package P08TextProcessing.MoreExercises;

import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            String input =scanner.nextLine();

            String name=input.split("[@\\|]")[1];
            String age=input.split("[#\\*]")[1];


            System.out.printf("%s is %s years old.%n",name,age);
        }
    }
}
