package P05Lists.MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numbers= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String inputText=scanner.nextLine();

        int sum=0;
        String concat="";
        StringBuilder build = new StringBuilder(inputText);


        for (int i = 0; i < numbers.size(); i++) {

            int currentNumber= numbers.get(i);
            int number=currentNumber;

            while (number > 0) {

                int lastDigit = number % 10;
                sum += lastDigit;
                number = number / 10;
            }
            if (sum > inputText.length()-1){
                sum=sum-inputText.length();
            }

            concat=concat+inputText.charAt(sum);
            String ch= String.valueOf(inputText.charAt(sum));
            build.deleteCharAt(sum);
            inputText= build.substring(0);
            sum=0;
        }
        System.out.println(concat);

    }
}
