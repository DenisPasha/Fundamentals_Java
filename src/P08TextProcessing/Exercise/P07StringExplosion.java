package P08TextProcessing.Exercise;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        StringBuilder sb=new StringBuilder(input);

        int powerLeftFromPrevious=0;
        for (int i = 0; i < sb.length(); i++) {
            char currentChar=sb.charAt(i);

           if (currentChar=='>'){
               int attackStrength= Integer.parseInt(sb.charAt(i+1)+"");
               powerLeftFromPrevious+=attackStrength;
               
           } else if (currentChar!='>'&& powerLeftFromPrevious>0) {
               sb.deleteCharAt(i);
               powerLeftFromPrevious--;
               i--;
           }
        }
        System.out.println(sb);

    }
}
