package P04Methods.MoreExercises;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type=scanner.nextLine();

        if (type.equals("int")){
            int number=Integer.parseInt(scanner.nextLine());
            readType(number);
        } else if (type.equals("real")) {
            double number=Integer.parseInt(scanner.nextLine());
            readType(number);
        } else if (type.equals("string")) {
            String input=scanner.nextLine();
            readType(input);
        }

    }
    public static void readType(int num){
        num=num*2;
        System.out.println(num);
    }
    public static void readType(double num){
        double result=num*1.5;
        System.out.printf("%.2f",result);
    }
    public static void readType(String input){
        System.out.printf("$%s$",input);
    }


}
