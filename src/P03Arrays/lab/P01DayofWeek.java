package P03Arrays.lab;

import java.util.Scanner;

public class P01DayofWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysNum=Integer.parseInt(scanner.nextLine());

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        if (daysNum>=1 && daysNum<=7){
            System.out.println(days [daysNum-1]);
        }else {
            System.out.println("Invalid day!");
        }

    }
}
