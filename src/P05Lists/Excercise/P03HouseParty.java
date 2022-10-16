package P05Lists.Excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> guestNames = new ArrayList<>();

        for (int i = 1; i <= countCommands; i++) {
            String command = scanner.nextLine();
            //•   "{name} is going!" -> split -> ["{name}", "is", "going!"] -> collect -> {"{name}", "is", "going!"} -> 3 елемента
            //•   "{name} is not going!" -> split -> ["{name}", "is", "not", "going!"] -> collect -> {"{name}", "is", "not", "going!"} -> 4 елемента
            List<String> commandParts = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String name = commandParts.get(0);
            //is going -> има или го няма
            if (commandParts.size() == 3) { //GOING
                if (guestNames.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestNames.add(name);
                }
            }
            //is not going -> има (премахвам) или няма
            else if (commandParts.size() == 4) { //NOT GOING
                if (guestNames.contains(name)) {
                    guestNames.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String name : guestNames) {
            System.out.println(name);
        }
    }
}
