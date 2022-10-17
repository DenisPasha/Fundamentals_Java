package MidExamExercises.P04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialHealth=100;
        int health=100;
        int bitcoins=0;

        List<String>dungeonRoomsList= List.of(scanner.nextLine().split("\\|"));
        int size=dungeonRoomsList.size();
        int counter=0;


        while (health > 0 && counter < dungeonRoomsList.size()-1){

            //looping through all rooms
            for (int i = 0; i < dungeonRoomsList.size(); i++) {
                String command=dungeonRoomsList.get(i);
                counter++;
                //getting current room command
                List<String>currentRoomList= List.of(command.split(" "));

                // getting the command and the number
                String currentCommand=currentRoomList.get(0);
                int currentCommandNum= Integer.parseInt(currentRoomList.get(1));

                if (currentCommand.equals("potion")){

                    int healthBef=health;
                    health+=currentCommandNum;
                    if (health > 100){
                        int diff=100-healthBef;
                        health=100;
                        System.out.printf("You healed for %d hp.",diff);
                    }else {
                        System.out.printf("You healed for %d hp.",currentCommandNum);
                    }

                    System.out.println();
                    System.out.printf("Current health: %d hp.",health);
                    System.out.println();


                }else if (currentCommand.equals("chest")){

                    bitcoins+=currentCommandNum;
                    System.out.printf("You found %d bitcoins.",currentCommandNum);
                    System.out.println();

                }else {
                    //fighting monster
                    health=health-currentCommandNum;
                    if (health > 0){
                        System.out.printf("You slayed %s.",currentCommand);
                        System.out.println();
                    }else {
                        System.out.printf("You died! Killed by %s.",currentCommand);
                        System.out.println();
                        System.out.printf("Best room: %d",i+1);

                        break;
                    }

                }

            }

        }
        if (health>0){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d",bitcoins);
            System.out.println();
            System.out.printf("Health: %d",health);
        }


    }
}
