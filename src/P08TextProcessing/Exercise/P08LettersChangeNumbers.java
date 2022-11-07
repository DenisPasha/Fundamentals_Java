package P08TextProcessing.Exercise;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String[]codes=input.split("\\s+");

        double firstSum=0;
        double secondSum=0;

        double total=0;

        for (int i = 0; i < codes.length; i++) {

            String currentElement=codes[i];

            char firstLetter=currentElement.charAt(0);
            char secondLetter=currentElement.charAt(currentElement.length()-1);

            StringBuilder number= new StringBuilder();
            number.append(currentElement,1,currentElement.length()-1);
            int numb= Integer.parseInt(number+"");

            //firstLetter
            if (Character.isUpperCase(firstLetter)){

                int positionInAlphabet=firstLetter-64;
                firstSum=numb*1.0 / positionInAlphabet;



            } else if (Character.isLowerCase(firstLetter)) {
                int positionInAlphabet=firstLetter-96;
                firstSum=numb*1.0 * positionInAlphabet;


            }

            //secondLetter
            if (Character.isUpperCase(secondLetter)){
                int positionInAlphabet=secondLetter-64;
                secondSum=firstSum-positionInAlphabet;



            } else if (Character.isLowerCase(secondLetter)) {
                int positionInAlphabet=secondLetter-96;
                secondSum=positionInAlphabet+firstSum;

            }
            total+=secondSum;
        }

        System.out.printf("%.2f",total);
    }
}
