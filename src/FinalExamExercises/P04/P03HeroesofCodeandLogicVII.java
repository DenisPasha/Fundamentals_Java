package FinalExamExercises.P04;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class P03HeroesofCodeandLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>>map=new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {

            String input=scanner.nextLine();
            String[] inputArr=input.split(" ");

            String hero=inputArr[0];
            int hp= Integer.parseInt(inputArr[1]);
            int mp= Integer.parseInt(inputArr[2]);

            map.put(hero,new ArrayList<>());
            map.get(hero).add(hp);
            map.get(hero).add(mp);

        }

        String command=scanner.nextLine();
        while (!command.contains("End")){

            if (command.contains("CastSpell")){

                String[]commandArr=command.split(" - ");

                String heroName=commandArr[1];
                int  MPneeded= Integer.parseInt(commandArr[2]);
                String spellName=commandArr[3];

               if(map.get(heroName).get(1) > MPneeded){
                   map.get(heroName).set(1,map.get(heroName).get(1) - MPneeded);
                   System.out.printf("%s has successfully cast %s and now has %d MP!%n",heroName,spellName,map.get(heroName).get(1));
               }else {
                   System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
               }

            } else if (command.contains("TakeDamage")) {
                String[]commandArr=command.split(" - ");

                String heroName=commandArr[1];
                int  damage= Integer.parseInt(commandArr[2]);
                String attacker=commandArr[3];

               map.get(heroName).set(0,map.get(heroName).get(0) - damage);
               if (map.get(heroName).get(0) > 0){
                   System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName,damage,attacker,map.get(heroName).get(0));
               }else {
                   System.out.printf("%s has been killed by %s!%n",heroName,attacker);
                   map.remove(heroName);
               }

                
            }else if (command.contains("Recharge")) {

                String[]commandArr=command.split(" - ");

                String heroName=commandArr[1];
                int  recharge= Integer.parseInt(commandArr[2]);

                int totalRecharged=recharge;

                int initialMP=map.get(heroName).get(1);

                int newMP=initialMP + recharge;

                if (newMP > 200){
                    newMP=200;
                    totalRecharged= newMP-initialMP;
                    map.get(heroName).set(1,newMP);
                    System.out.printf("%s recharged for %d MP!%n",heroName,totalRecharged);
                }else {
                    System.out.printf("%s recharged for %d MP!%n",heroName,totalRecharged);
                    map.get(heroName).set(1,newMP);
                }


            }else if (command.contains("Heal")) {

                String[]commandArr=command.split(" - ");

                String heroName=commandArr[1];
                int  amount= Integer.parseInt(commandArr[2]);

                int totalRecharged=amount;

                int initialHP=map.get(heroName).get(0);

                int newHP=initialHP + amount;

                if (newHP > 100){
                    newHP=100;
                    totalRecharged= newHP-initialHP;
                    map.get(heroName).set(0,newHP);
                    System.out.printf("%s healed for %d HP!%n",heroName,totalRecharged);
                }else {
                    System.out.printf("%s healed for %d HP!%n",heroName,totalRecharged);
                    map.get(heroName).set(0,newHP);
                }


            }


            command=scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {

            System.out.printf("%s%n",entry.getKey());

            System.out.printf("HP: %d%n",entry.getValue().get(0));
            System.out.printf("MP: %d%n",entry.getValue().get(1));
        }

    }
}
