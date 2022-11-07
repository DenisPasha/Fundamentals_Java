package P08TextProcessing.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        String[] path=(input.split("\\\\"));
        String last=path[path.length-1];
        String file=last.split("\\.")[0];
        String extension=last.split("\\.")[1];

        System.out.printf("File name: %s\n" +
                "File extension: %s\n",file,extension);

    }
}
