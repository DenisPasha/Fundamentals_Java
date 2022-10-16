package P05Lists.MoreExercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyAvailable=Double.parseDouble(scanner.nextLine());
        List<Integer>drumsList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer>drumsListStartingPoint=new ArrayList<>();

        drumsListStartingPoint.addAll(drumsList);

        String command=scanner.nextLine();

        while (!command.equals("Hit it again, Gabsy!")){

            int damagePower= Integer.parseInt(command);

            for (int i = 0; i < drumsList.size(); i++) {
                int currentDrum=drumsList.get(i);

                currentDrum=currentDrum-damagePower;
                drumsList.set(i,currentDrum);

                if (currentDrum < 0){

                    double neededMoney=drumsListStartingPoint.get(i)*3;
                    if (moneyAvailable-neededMoney > 0){

                        currentDrum=drumsListStartingPoint.get(i);
                        moneyAvailable=moneyAvailable-drumsListStartingPoint.get(i)*3;
                        drumsList.set(i,drumsListStartingPoint.get(i));

                    }else {
                        drumsList.remove(drumsList.get(i));
                        i--;
                        System.out.println();


                    }

                }

            }

            command=scanner.nextLine();
        }
        for (int item:drumsList) {
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.",moneyAvailable);
    }
}
