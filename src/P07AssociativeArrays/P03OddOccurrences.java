package P07AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>inputList= Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        Map<String,Integer>wordsMap=new LinkedHashMap<>();



        for (int i = 0; i <inputList.size() ; i++) {
            String currentWord= inputList.get(i);
            currentWord=currentWord.toLowerCase(Locale.ROOT);

            wordsMap.putIfAbsent(currentWord,0);
            wordsMap.put(currentWord,wordsMap.get(currentWord)+1);


        }

        List<String>oddList=new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2!=0){
                oddList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ",oddList));

    }
}
