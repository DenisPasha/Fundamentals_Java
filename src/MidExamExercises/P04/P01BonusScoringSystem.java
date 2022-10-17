package MidExamExercises.P04;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudent=Integer.parseInt(scanner.nextLine());
        int numOfLecturers=Integer.parseInt(scanner.nextLine());
        int additionalBonus=Integer.parseInt(scanner.nextLine());

        double maxBonus=Double.MIN_VALUE;
        int  maxAttendances=Integer.MIN_VALUE;

        for (int i = 1; i <=numberOfStudent ; i++) {
            int attendances =Integer.parseInt(scanner.nextLine());
            //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
            double totalBonus=attendances*1.0 / numOfLecturers * (5 + additionalBonus);

            if (totalBonus > maxBonus){
                maxBonus = totalBonus;
            }
            if (attendances > maxAttendances){
                maxAttendances = attendances;
            }


        }
        double maxBonusi=Math.round(maxBonus);
        int finalBonus= (int) maxBonusi;
        System.out.printf("Max Bonus: %d.",finalBonus);
        System.out.println();
        System.out.printf("The student has attended %d lectures.",maxAttendances);
    }
}
