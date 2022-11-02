package P07AssociativeArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputArr=Arrays.stream(scanner.nextLine().split(" ")).filter(e -> e.length() % 2==0).toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(),inputArr));
    }
}
