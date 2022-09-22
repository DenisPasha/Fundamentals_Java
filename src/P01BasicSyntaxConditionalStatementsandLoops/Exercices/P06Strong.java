package P01BasicSyntaxConditionalStatementsandLoops.Exercices;

import java.util.Scanner;

public class P06Strong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num= Integer.parseInt(scanner.nextLine());
        int stasrtNum=num;

        int sum=0;
        while (num>0){
            int lastDigit=num%10;

            int currentFac=1;
            for (int i=1; i<=lastDigit; i++){
                currentFac=currentFac*i;
            }
            sum=sum+currentFac;
            num=num/10;

        }

        if (sum==stasrtNum){
            System.out.printf("yes");
        }else {
            System.out.printf("no");
        }





    }
}
