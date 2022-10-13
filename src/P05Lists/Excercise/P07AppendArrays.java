package P05Lists.Excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> input = Arrays.stream(sc.nextLine().split("\\|")).collect(Collectors.toList());

        List<String> output = new ArrayList<>();

        for (int i = input.size() - 1; i >= 0; i--) {

            String[] numbers = input.get(i).split("\\s+");
            for (int j = 0; j < numbers.length; j++) {
                if (!numbers[j].equals("")) {
                    output.add(numbers[j]);
                }
            }
        }

        String print = output.toString().trim();
        System.out.println(print.replaceAll("\\[|,|\\]", ""));

    }
}
