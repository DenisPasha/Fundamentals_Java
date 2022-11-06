package P08TextProcessing.lab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove=scanner.nextLine();
        String text=scanner.nextLine();

        while (text.contains(toRemove)){

           text= text.replace(toRemove,"");

        }
        System.out.println(text);
    }
}
