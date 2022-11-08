package P08TextProcessing.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]numArr=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        String command=scanner.nextLine();
        StringBuilder sb=new StringBuilder();

        while (!command.equals("find")){


            String code=command;

            for (int i = 0; i < code.length(); i++) {
                int index=i;

                int count= code.length()- numArr.length;

                if (i >= numArr.length){
                    index=i - numArr.length;
                }

                for (int j = 1; j <= count ; j++) {
                    if (index >= numArr.length){
                    index=index - numArr.length;
                     }
                }

                int currentNum=numArr[index];

                for (int j = 0; j < code.length(); j++) {

                    char currentChar=code.charAt(i);
                    currentChar= (char) (currentChar-currentNum);
                    sb.append(currentChar);
                    break;

                }


            }

            String type= sb.toString();

            String metal=type.split("&")[1];
            String coordinates=type.split("[<\\>]")[1];

            System.out.printf("Found %s at %s%n",metal,coordinates);
            sb.delete(0,sb.length());

            command=scanner.nextLine();
        }


    }
}
