package P02DataTypesandVariables.lab;

import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city=scanner.nextLine();
        int population= Integer.parseInt(scanner.nextLine());
        int area= Integer.parseInt(scanner.nextLine());

        String result=String.format("Town %s has population of %d and area %d square km.",city,population,area);
        System.out.println(result);


    }
}
