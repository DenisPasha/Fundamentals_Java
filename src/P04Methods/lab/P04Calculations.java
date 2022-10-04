package P04Methods.lab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command=scanner.nextLine();
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":
                addNums(num1,num2);
                break;
            case "multiply":
                multiplyNums(num1,num2);
                break;
            case "subtract":
                subtractNums(num1,num2);
                break;
            case "divide":
                divideNums(num1,num2);
                break;

        }
    }

    public static void addNums(int a, int b){

        System.out.println(a+b);

    }
    public static void multiplyNums(int a, int b){

        System.out.println(a*b);

    }
    public static void subtractNums(int a, int b){

        System.out.println(a-b);

    }
    public static void divideNums(int a, int b){

        System.out.println(a/b);

    }

}
