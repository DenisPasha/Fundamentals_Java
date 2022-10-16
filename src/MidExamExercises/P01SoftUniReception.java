package MidExamExercises;

import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());

        int studentCount=Integer.parseInt(scanner.nextLine());

        int totalAnswerPerHour=a+b+c;

        int hours=0;


        while (studentCount > 0){

            studentCount=studentCount-totalAnswerPerHour;
            hours++;
            if (hours%4==0){
                hours++;
            }
        }


        System.out.printf("Time needed: %dh.",hours);

    }
}
