package MidExamExercises.P02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array =Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        String[] command=scanner.nextLine().split(" ");


        int lastPosition = 0;
        int successMision = 0;

        while (!command[0].equals("Love!")) {

            int jumpLength = Integer.parseInt(command[1]);
            lastPosition += jumpLength;

            if (lastPosition < 0 || lastPosition >= array.length)
            {
                lastPosition = 0;
            }

            if (array[lastPosition] != 0)
            {
                array[lastPosition] -= 2;

                if (array[lastPosition] == 0)
                {
                    successMision++;
                    System.out.printf("Place %d has Valentine's day.",lastPosition);
                    System.out.println();

                }
            }
            else
            {
                System.out.printf("Place %d already had Valentine's day.",lastPosition);
                System.out.println();

            }

            command=scanner.nextLine().split(" ");

        }

        System.out.printf("Cupid's last position was %d.",lastPosition);
        System.out.println();


        if (successMision == array.length)
        {
            System.out.println("Mission was successful.");

        }
        else
        {
            System.out.printf("Cupid has failed %d places.",successMision);

        }
    }


}
