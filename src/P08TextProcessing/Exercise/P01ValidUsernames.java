package P08TextProcessing.Exercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]inputArr=scanner.nextLine().split(", ");
        StringBuilder print=new StringBuilder();

        for (int i = 0; i < inputArr.length; i++) {
            String currentWord=inputArr[i];


            if (currentWord.length()>=3 && currentWord.length()<=16){
                boolean isValid=true;
                for (int j = 0; j < currentWord.length(); j++) {
                    char currentChar=currentWord.charAt(j);

                    if (!Character.isLetterOrDigit(currentChar)){

                        if (currentChar!=45){

                            if (currentChar!=95){

                                isValid=false;
                            }
                        }
                    }


                }
                if (isValid){
                    System.out.println(currentWord);
                }

            }



        }
    }
}
