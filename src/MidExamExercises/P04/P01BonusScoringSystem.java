package MidExamExercises.P04;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudent=Integer.parseInt(scanner.nextLine());
        int numOfLecturers=Integer.parseInt(scanner.nextLine());
        int additionalBonus=Integer.parseInt(scanner.nextLine());

        double maxBonus=0;
        int  maxAttendances=0;

        for (int i = 1; i <=numberOfStudent ; i++) {
            int attendances =Integer.parseInt(scanner.nextLine());
            //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
            double totalBonus=1.0*attendances / numOfLecturers * (5 + additionalBonus);

            if (totalBonus > maxBonus){
                maxBonus = totalBonus;
            }
            if (attendances > maxAttendances){
                maxAttendances = attendances;
            }


        }
        double maxBonusi=Math.ceil(maxBonus);
        double finalBonus=maxBonusi;
        System.out.printf("Max Bonus: %.0f.",finalBonus);
        System.out.println();
        System.out.printf("The student has attended %d lectures.",maxAttendances);
    }
}
