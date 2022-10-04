package P03Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int [] input1=Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] input2=Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum=0;
        int diff=0;
        boolean isDifferent=false;


        for (int i = 0; i < input1.length; i++) {


                if (input1[i]==input2[i]){
                    sum+=input1[i];
                }else {
                     diff=i;
                    isDifferent=true;
                    break;
                }

        }
        if (isDifferent){
            System.out.printf("Arrays are not identical. Found difference at %d index.",diff);
        }


    }
}
