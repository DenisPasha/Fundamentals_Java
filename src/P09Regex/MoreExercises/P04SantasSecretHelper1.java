package P09Regex.MoreExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04SantasSecretHelper1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int code=Integer.parseInt(scanner.nextLine());
        Map<String,String> map=new LinkedHashMap<>();

        String message=scanner.nextLine();
        while (!message.equals("end")){
            StringBuilder sb=new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char currentChar=message.charAt(i);
                char modified= (char) (currentChar-code);
                sb.append(modified);

            }
            String regexName="@(?<name>[A-Za-z]+)";
            Pattern namePattern= Pattern.compile(regexName);
            Matcher nameMatcher=namePattern.matcher(sb);
            String name="";
            while (nameMatcher.find()){
                name=nameMatcher.group("name");
            }

            String regexBehavior="!(?<behaivoir>[G,N])!";
            Pattern behaivoirPattern= Pattern.compile(regexBehavior);
            Matcher behavoirMatcher=behaivoirPattern.matcher(sb);
            String behavior="";
            while (behavoirMatcher.find()){
               behavior=behavoirMatcher.group("behaivoir");
            }


            map.putIfAbsent(name,behavior);



            message=scanner.nextLine();
        }

        List<String>kidsList=new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("G")){
                kidsList.add(entry.getKey());
            }
        }

        kidsList.forEach(kid-> System.out.println(kid));

    }
}
