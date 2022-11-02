package P07AssociativeArrays;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());
        Map<String,List<String>>wordMap=new LinkedHashMap<>();


        for (int i = 1; i <=n ; i++) {

            String word=scanner.nextLine();
            String synonym=scanner.nextLine();

            wordMap.putIfAbsent(word, new ArrayList<>());
            wordMap.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> entry : wordMap.entrySet()) {

            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ",entry.getValue()));

        }


    }
}
