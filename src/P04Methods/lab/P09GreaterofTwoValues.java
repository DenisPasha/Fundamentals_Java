package P04Methods.lab;

import java.util.Scanner;

public class P09GreaterofTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type=scanner.nextLine();

        int num1=0;
        int num2=0;
        char one=0;
        char two=0;
        String text1="";
        String text2="";


        if (type.equals("int")){
            num1=Integer.parseInt(scanner.nextLine());
            num2=Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(num1,num2));

        } else if (type.equals("char")) {
            one=scanner.nextLine().charAt(0);
            two=scanner.nextLine().charAt(0);
            System.out.println(getMax(one,two));

        } else if (type.equals("string")) {
            text1=scanner.nextLine();
            text2=scanner.nextLine();
            System.out.println(getMax(text1,text2));
        }


    }

    public static int getMax(int num1 ,int num2){
        int result=0;
        if (num1>num2){
            result=num1;
        }else {
            result=num2;
        }
        return result;
    }

    public static char getMax(char one, char two){
        char result=0;
        if (one>two){
            result=one;
        }else {
            result=two;
        }
        return result;

    }

    public static String getMax(String text1, String text2){

       if (text1.compareTo(text2)>0){
           return text1;
       }else {
           return text2;
       }

    }

}
