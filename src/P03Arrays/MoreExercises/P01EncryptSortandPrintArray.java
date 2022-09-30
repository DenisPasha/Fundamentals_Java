package P03Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortandPrintArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int[] numbers=new int[n];

        int length=0;
        for (int i = 0; i < n; i++) {

            String input=scanner.nextLine();
            int vowelSum=0;
            int consonantSum=0;



            char[] inputArr=input.toCharArray();

            for (char currentLatter : inputArr) {
                length = inputArr.length;
                if (currentLatter == 65 || currentLatter == 97 || currentLatter == 69 || currentLatter == 101
                        || currentLatter == 73 || currentLatter == 105
                        || currentLatter == 79 || currentLatter == 111
                        || currentLatter== 85 || currentLatter==117) {
                    vowelSum = vowelSum + currentLatter;
                } else {
                    consonantSum = consonantSum + currentLatter;
                }


            }

            vowelSum=vowelSum* length;
            consonantSum=consonantSum/ length;
            int total=vowelSum+consonantSum;
            numbers[i]=total;





        }
        Arrays.sort(numbers);
        for (int nums:numbers) {
            System.out.println(nums);
        }

    }
}
