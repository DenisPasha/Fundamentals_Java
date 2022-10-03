package P03Arrays.Exercises;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int [] numbers=Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int rotations=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=rotations ; i++) {

            int firstE=0;
            firstE=numbers[0];
            for (int j = 0; j < numbers.length-1; j++) {

                numbers[j]=numbers[j+1];

            }
            numbers[numbers.length-1]=firstE;

        }

        for (int item:numbers) {
            System.out.print(item+" ");
        }
    }
}
