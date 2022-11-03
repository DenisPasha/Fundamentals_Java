package P07AssociativeArrays.Lab;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        Map<String,List<String>>synonymsMap=new LinkedHashMap<>();
        List<String>synonymList ;

        for (int i = 1; i <=n ; i++) {

            String word=scanner.nextLine();
            String synonym=scanner.nextLine();

            synonymsMap.putIfAbsent(word,new ArrayList<>());
            synonymsMap.get(word).add(synonym);



        }

        for (Map.Entry<String, List<String>> entry : synonymsMap.entrySet()) {

            System.out.printf("%s - %s %n",entry.getKey(),String.join(", ", entry.getValue()));
        }

    }
}
