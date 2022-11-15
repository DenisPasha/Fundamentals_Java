package P09Regex.MoreExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P03PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String[]inputArr=input.split("\\|");

        String firstPart=inputArr[0];
        String secondPart=inputArr[1];
        String thirdPart=inputArr[2];

        //part one finding starting letters
        String regexCapitalLetters="([#$%*&]+)(?<capitalLetters>[A-Z]+)\\1";
        Pattern capitalLettersPatter= Pattern.compile(regexCapitalLetters);
        Matcher capitalLettersMatcher= capitalLettersPatter.matcher(firstPart);

        StringBuilder capitalLetters=new StringBuilder();
        while (capitalLettersMatcher.find()){
            capitalLetters.append(capitalLettersMatcher.group("capitalLetters"));
        }

        //part two finding asci codes
        String regexForDigits="(?<asciCode>\\d{2}):(?<length>\\d{2})";
        Pattern digitsPattern= Pattern.compile(regexForDigits);
        Matcher digitsMatcher= digitsPattern.matcher(secondPart);

        Map<Character,Integer>map=new LinkedHashMap<>();
        Map<Integer,Integer>codeAndLengthMap=new LinkedHashMap<>();
        while (digitsMatcher.find()){

            int asciCode= Integer.parseInt(digitsMatcher.group("asciCode"));
            int length= Integer.parseInt(digitsMatcher.group("length"));

            for (int i = 0; i <capitalLetters.length() ; i++) {
                char currentChar=capitalLetters.charAt(i);
                if (currentChar== asciCode){
                    map.putIfAbsent(currentChar,length);
                }
            }

        }


        // third part

        List<String>wordsList=new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            String letter= String.valueOf(entry.getKey());
            int length=entry.getValue();

            String regexLast= "\\b"+" "+letter+"[\\w-]{"+length+"}\\b";
            Pattern lastPattern= Pattern.compile(regexLast);
            Matcher lMatcher= lastPattern.matcher(thirdPart);

            while (lMatcher.find()){
                wordsList.add(lMatcher.group());
            }

        }


        for (int i = 0; i < wordsList.size(); i++) {
            String currentWord= wordsList.get(i);
           String modifiedWord=currentWord.replace(" ","");
           wordsList.set(i,modifiedWord);
        }



        List<String>modifiedList=new ArrayList<>();

        for (int i = 0; i < capitalLetters.length(); i++) {
            char currentChar=capitalLetters.charAt(i);

            for (int j = 0; j < wordsList.size(); j++) {
                String word= wordsList.get(j);
                char searched=word.charAt(0);
                if (currentChar==searched){
                    modifiedList.add(word);
                }
            }

        }

        modifiedList.forEach(word-> System.out.println(word));
       // map.entrySet().forEach(characterIntegerEntry -> System.out.printf("%s %d%n",characterIntegerEntry.getKey(),characterIntegerEntry.getValue()));


    }
}
