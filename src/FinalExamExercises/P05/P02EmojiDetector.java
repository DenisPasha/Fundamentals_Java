package FinalExamExercises.P05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String digitRegex = "\\d";

        String regex = "(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))";

        Pattern pattern1 = Pattern.compile(digitRegex);
        Pattern pattern2 = Pattern.compile(regex);

        String input = scanner.nextLine();

        int sum = 1;

        int coolthreshold = 0;
        List<String> emoji = new ArrayList<>();
        List<String> alleEmoji = new ArrayList<>();

        Matcher matcher2 = pattern1.matcher(input);


        while(matcher2.find()){
            int diggit = Integer.parseInt(matcher2.group(0));
            sum = sum*diggit;
        }

        Matcher matcher = pattern2.matcher(input);
        while(matcher.find()){

            String name1 = matcher.group("name");

            int sumChar =0;
            for (int i = 2; i <name1.length()-2 ; i++) {
                char sign = name1.charAt(i);
                sumChar+=(int) sign;
            }
            alleEmoji.add(name1);

            if(sumChar>sum) {
                emoji.add(name1);
            }
        }


        System.out.printf("Cool threshold: %d%n",sum);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",alleEmoji.size());

        for (String a: emoji
        ) {
            System.out.printf("%s%n",a);
        }

    }
}
