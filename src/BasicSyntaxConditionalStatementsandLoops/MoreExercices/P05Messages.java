package BasicSyntaxConditionalStatementsandLoops.MoreExercices;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        int digitsCounter=0;

        //important
        int numOfDigits=0;

        for (int i=1; i<=n; i++){

            int num= Integer.parseInt(scanner.nextLine());
            String numss= String.valueOf(num);

            for (int j=0; j<=numss.length(); j++ ){
                numOfDigits=j;
            }

            char firstNum=numss.charAt(0);
            int mainDigit=Integer.parseInt(String.valueOf(firstNum));
            int offset=(mainDigit-2)*3;


            if (mainDigit==8||mainDigit==9){
                offset++;
            }

            int letterIndex=offset+numOfDigits-1;
            int letterASCIcode=97+letterIndex;

            if (letterASCIcode==91){
                letterASCIcode=32;
            }

            System.out.printf("%c",letterASCIcode);


        }



    }
}
