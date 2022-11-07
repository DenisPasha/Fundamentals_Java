package P08TextProcessing.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger bigNum=new BigInteger(scanner.nextLine());
        int n=Integer.parseInt(scanner.nextLine());

        BigInteger sum=bigNum.multiply(BigInteger.valueOf(n));
        System.out.println(sum);
    }
}
