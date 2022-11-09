package P08TextProcessing.MoreExercises;

import java.util.*;

public class P04MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String code=scanner.nextLine();


       String[]morseArr=code.split(" ");

        Map<String,Character>map=new LinkedHashMap<>();

        String[] morseCodeAlphabet
                = { ".-", "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };

        char[] englishAlphabetArr = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', '0' };

        for (int i = 0; i <morseCodeAlphabet.length ; i++) {

            String currentMorseString=morseCodeAlphabet[i];
            char currentLetter=englishAlphabetArr[i];

            map.put(currentMorseString,currentLetter);
        }

        StringBuilder text=new StringBuilder();

        for (int i = 0; i < morseArr.length; i++) {
            String currentCode=morseArr[i];


            if (currentCode.equals("|")){
                text.append(" ");
            }else {
                text.append(map.get(currentCode));
            }





        }
        System.out.println(text.toString().toUpperCase(Locale.ROOT));

    }
}
