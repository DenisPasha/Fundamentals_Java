package MidExamExercises.P03;

import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy=Integer.parseInt(scanner.nextLine());

        String command=scanner.nextLine();
        int winCount=0;
        boolean notEnoughEnergy=false;

        while (!command.equals("End of battle")){

            int energyGone= Integer.parseInt(command);

            if (initialEnergy < energyGone){
                notEnoughEnergy=true;
                break;
            }else {
                initialEnergy=initialEnergy-energyGone;
                winCount++;
                if (winCount % 3==0){
                    initialEnergy+=winCount;
                }
            }


            command=scanner.nextLine();
        }
        if (command.equals("End of battle")){
            System.out.printf("Won battles: %d. Energy left: %d",winCount,initialEnergy);
        }
        if (notEnoughEnergy) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",winCount,initialEnergy);
            System.out.println();
        }
    }
}
