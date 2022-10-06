package P04Methods.Exercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        isPalindromeNum();

    }

    public static void isPalindromeNum(){

        Scanner scanner = new Scanner(System.in);
        String command=scanner.nextLine();
        boolean isPalindrome=false;

        while (!command.equals("END")){


          char []ch=command.toCharArray();
          char[] reversed=new char[ch.length];

          int j= ch.length;

            for (int i = 0; i < ch.length  ; i++) {
                reversed[j - 1] = ch[i];
                j = j - 1;
            }
            String reversedCommand= String.valueOf(reversed);

            if (reversedCommand.equals(command)){
                isPalindrome=true;
                System.out.println(isPalindrome);
            }else {
                isPalindrome=false;
                System.out.println(isPalindrome);
            }

            command=scanner.nextLine();
        }


    }
}
