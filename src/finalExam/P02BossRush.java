package finalExam;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {

            boolean isValid=false;
            String bossName=scanner.nextLine();
            String regexForBoss="(\\|)(?<bossName>[A-Z]{4,})\\1:#(?<title>[A-Za-z]+ [A-Za-z]+)#";

            Pattern pattern= Pattern.compile(regexForBoss);
            Matcher matcher= pattern.matcher(bossName);

            while (matcher.find()){

                isValid=true;
                String boss = matcher.group("bossName");
                String title = matcher.group("title");

                int strength = boss.length();
                int armor = title.length();
                System.out.printf("%s, The %s%n",boss,title);
                System.out.printf(">> Strength: %d%n",strength);
                System.out.printf(">> Armor: %d%n",armor);

            }
            if (!isValid){
                System.out.println("Access denied!");
            }

        }

    }
}
