package P02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a= Integer.parseInt(scanner.nextLine());
        int b= Integer.parseInt(scanner.nextLine());
        int c= Integer.parseInt(scanner.nextLine());
        int d= Integer.parseInt(scanner.nextLine());

        int sum=(a+b)/c;
        int total=sum*d;
        System.out.println(total);

    }
}
