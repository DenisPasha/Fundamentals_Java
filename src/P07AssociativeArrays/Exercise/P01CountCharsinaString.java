package P07AssociativeArrays.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        Map<Character,Integer>map=new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar=input.charAt(i);

            if (currentChar==32){
                continue;
            }

            map.putIfAbsent(currentChar,0);
            map.put(currentChar,map.get(currentChar)+1);

        }

        map.entrySet().forEach(characterIntegerEntry -> System.out.printf("%c -> %d%n",characterIntegerEntry.getKey(),
                characterIntegerEntry.getValue()));
    }
}
