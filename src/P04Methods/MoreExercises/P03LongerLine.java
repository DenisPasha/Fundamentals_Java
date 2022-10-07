package P04Methods.MoreExercises;

import java.util.Scanner;

public class P03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());

        LongestLine(x1, y1, x2, y2,x3,y3,x4,y4);
    }

    static void ClosestToZero (double a, double b, double c , double d)
    {
        double first = Math.sqrt(Math.pow(Math.abs(a), 2) + Math.pow(Math.abs(b), 2));
        double second = Math.sqrt(Math.pow(Math.abs(c), 2) + Math.pow(Math.abs(d), 2));
        if (first > second)
        {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",c,d,a,b);

        }
        else
        {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",a,b,c,d);

        }
    }

    static void LongestLine (double a, double b, double c, double d, double e, double f, double g, double h)
    {
        double firstLine = Math.sqrt(Math.pow(Math.abs(a-c), 2) + Math.pow(Math.abs(b-d), 2));
        double secondLine = Math.sqrt(Math.pow(Math.abs(e-g), 2) + Math.pow(Math.abs(f-h), 2));
        if (firstLine>=secondLine)
        {
            ClosestToZero(a, b, c, d);
        }
        else
        {
            ClosestToZero(e, f, g, h);
        }
    }
}


