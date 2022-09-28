package P03Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String numStream=scanner.nextLine();
        int position=Integer.parseInt(scanner.nextLine());
        int poss=position;

        String[] arrayFirst=numStream.split(" ");

        if(position > arrayFirst.length)
        {
            position -= arrayFirst.length;
        }
        String[]arrNew=new String[arrayFirst.length-position];
        int counter=0;
        String[] temp=new String[position];


        for (int i = 0; i < position; i++) {

            temp[i]=arrayFirst[i];
        }

        for (int i = 0; i < arrayFirst.length-position ; i++) {

            arrNew[i]=arrayFirst[i+position];

        }
        String[] lastArray=new String[arrNew.length+temp.length];
        System.arraycopy(arrNew,0,lastArray,0,arrNew.length);
        System.arraycopy(temp,0,lastArray,arrNew.length,temp.length);

        for (int g = 0; g < lastArray.length; g++) {
            System.out.print(lastArray[g]+" ");
        }





    }
}
