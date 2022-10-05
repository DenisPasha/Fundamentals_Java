package P04Methods.Exercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();

        boolean condition1=isCorrectAmountOfCharacters(input);
        boolean condition2=validContent(input);
        boolean condition3=correctAmountOfDigits(input);

        if (condition1 && condition2 && condition3){
            System.out.println("Password is valid");
        }


    }

    private static boolean isCorrectAmountOfCharacters(String input){

        boolean isOk=false;
       if (input.length()>=6 && input.length()<=10){
           isOk=true;
       }else {
           System.out.println("Password must be between 6 and 10 characters");
       }
return isOk;

    }

    private static boolean validContent(String input){

        char[] inputArr=input.toCharArray();

        for (char symbol:inputArr) {

            if (!Character.isLetterOrDigit(symbol)){
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;

    }

    private static boolean correctAmountOfDigits(String input){

        char[] inputArray=input.toCharArray();
        int counter=0;
        boolean isCorrect=false;

        for (char symbol:inputArray) {
            if (Character.isDigit(symbol)){
                counter++;
            }
        }
        if (counter>=2){
            isCorrect=true;
        }else {
            isCorrect=false;
            System.out.println("Password must have at least 2 digits");
        }
        return isCorrect;

    }
}
