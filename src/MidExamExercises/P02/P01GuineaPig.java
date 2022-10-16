package MidExamExercises.P02;

import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double food = Double.parseDouble(scanner.nextLine()) * 1000;
        double hay = Double.parseDouble(scanner.nextLine()) * 1000;
        double cover = Double.parseDouble(scanner.nextLine()) * 1000;

        double pigWeight = Double.parseDouble(scanner.nextLine()) * 1000;
        int days = 1;

        while (days <= 30) {
            food -= 300;
            if (days % 2 == 0) {
                hay -= (food * 5) / 100;
            }
            if (days % 3 == 0) {
                cover -= pigWeight * 0.3333;
            }
            // days++ used at the end of the cycle
            days++;
        }
        double foodKg = food / 1000;
        double hayKg = hay / 1000;
        double coverKg = cover / 1000;

        // foodKg, hayKg, coverKg in validations
        if (foodKg >= 0 && hayKg >= 0 && coverKg >= 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodKg, hayKg, coverKg);

            // || must be used for other case
        } else if (foodKg < 0 || hayKg < 0 || coverKg < 0) {
            System.out.printf("Merry must go to the pet store!");
        }
    }
}
