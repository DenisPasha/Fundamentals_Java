package P02DataTypesandVariables.MoreExercises;

import java.util.Scanner;

public class P02FromLefttoTheRight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {

            String input=scanner.nextLine();

            String[] parts=input.split(" ");
            String part1=parts[0];
            String part2=parts[1];

            long number1= Long.parseLong(part1);
            long number2= Long.parseLong(part2);

            long sum=0;


            if (number1>=number2){
                while (number1!=0){
                    sum=sum+number1%10;
                    number1=number1/10;
                }


            }else {
                while (number2!=0){
                    sum=sum+number2%10;
                    number2=number2/10;
                }

            }
            System.out.println(sum);


        }
    }
}
