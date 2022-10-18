package MidExamExercises.P05;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days=Integer.parseInt(scanner.nextLine());
        double plunderDorDay=Integer.parseInt(scanner.nextLine());
        double expectedPlunder=Integer.parseInt(scanner.nextLine());
        double thirdDayBonus=plunderDorDay/2;

        double plunder=0;
        int day=0;

        while (days > 0){

            day++;
            plunder=plunder+plunderDorDay;
            if (day % 3==0){
                plunder+=thirdDayBonus;
            }
            if (day % 5==0){
                plunder=plunder-plunder*0.30;
            }
            days--;
        }

        if (plunder >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.",plunder);
        }else {
            double percent=plunder / expectedPlunder * 100;
            System.out.printf("Collected only %.2f%% of the plunder.",percent);
        }
    }
}
