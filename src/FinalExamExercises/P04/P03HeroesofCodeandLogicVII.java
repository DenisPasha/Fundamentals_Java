package FinalExamExercises.P04;

import java.util.*;

public class P03HeroesofCodeandLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        Map<String,List<Integer>>map= new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String[] inputArr=scanner.nextLine().split(" ");
            String heroName = inputArr[0];
            int hitPoints = Integer.parseInt(inputArr[1]);
            int manaPoints = Integer.parseInt(inputArr[2]);

            map.putIfAbsent(heroName,new ArrayList<>());
            int hp = 0;
            if (!map.get(heroName).isEmpty()){
                 hp = map.get(heroName).get(0);
            }

            if (hp+hitPoints <= 100 ){
                map.get(heroName).add(0,hitPoints);
            }else {
                map.get(heroName).add(0,100);
            }

            int mp = 0;
            if (map.get(heroName).size() > 1){
                mp = map.get(heroName).get(1);
            }

            if (mp+manaPoints <= 200 ){
                map.get(heroName).add(1,manaPoints);
            }else {
                map.get(heroName).add(1,200);
            }

        }
        System.out.println();
        String comands=scanner.nextLine();

        String[] commandArr=comands.split(" - ");
        while (!commandArr[0].equals("End")){

            String command = commandArr[0];
            if (command.equals("CastSpell")){
                String heroName = commandArr[1];
                int mpNeeded= Integer.parseInt(commandArr[2]);
                String spell=commandArr[3];

                if (map.get(heroName).get(1) - mpNeeded >= 0){
                   int mp = map.get(heroName).get(1) - mpNeeded;
                   map.get(heroName).set(1,mp);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n",heroName,spell,map.get(heroName).get(1));
                }else {
                    System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spell);
                }


            } else if (command.equals("TakeDamage")) {
                String heroName = commandArr[1];
                int hpDamage = Integer.parseInt(commandArr[2]);
                String attacker = commandArr[3];

                int leftHp = map.get(heroName).get(0) - hpDamage;
                if (leftHp <= 0){
                    System.out.printf("%s has been killed by %s!%n",heroName,attacker);
                    map.remove(heroName);
                }else {
                    map.get(heroName).set(0,leftHp);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName,hpDamage,attacker,leftHp);
                }

            } else if (command.equals("Recharge")) {
                String heroName=commandArr[1];
                int amountMp= Integer.parseInt(commandArr[2]);

                int initialMp=map.get(heroName).get(1);

                int currentMp = amountMp + map.get(heroName).get(1);


                if (currentMp > 200){
                    currentMp = 200;
                    int diff = currentMp - initialMp;
                    map.get(heroName).set(1,currentMp);
                    System.out.printf("%s recharged for %d MP!%n",heroName,diff);
                }else {
                    map.get(heroName).set(1,currentMp);
                    System.out.printf("%s recharged for %d MP!%n",heroName,amountMp);
                }

            }else if (command.equals("Heal")) {
                String heroName=commandArr[1];
                int amountHP= Integer.parseInt(commandArr[2]);

                int initialHP=map.get(heroName).get(0);
                int totalHP= initialHP + amountHP;



                if ( totalHP > 100 ){
                    totalHP = 100;
                    int diff = totalHP - initialHP;
                    map.get(heroName).set(0,totalHP);
                    System.out.printf("%s healed for %d HP!%n",heroName,diff);
                }else {
                    map.get(heroName).set(0,totalHP);
                    System.out.printf("%s healed for %d HP!%n",heroName,amountHP);
                }

            }


            commandArr=scanner.nextLine().split(" - ");
        }

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            System.out.printf("%s%n",entry.getKey());
            int hp= map.get(entry.getKey()).get(0);
            int mp= map.get(entry.getKey()).get(1);

            System.out.printf("HP: %d%n",hp);
            System.out.printf("MP: %d%n",mp);
        }


    }
}
