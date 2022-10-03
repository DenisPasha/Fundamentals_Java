package P03Arrays.MoreExercises;

import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = Integer.parseInt(scanner.nextLine());

        for (long rows = 1; rows <= n; rows++) {

            long C = 1;

            for(long columns = 1; columns <= rows; columns++) {

                System.out.print(C + " ");
                C = C * (rows - columns) / columns;
            }
            System.out.println();
        }
    }

}

