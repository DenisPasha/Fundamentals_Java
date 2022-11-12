package P09Regex.lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names=scanner.nextLine();
        Pattern pattern= Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        Matcher matcher = pattern.matcher(names);

        while (matcher.find()){
            System.out.printf("%s ",matcher.group());
        }

    }
}
