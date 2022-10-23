package P06ObjectAndClasses.Exercises.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        List<Students>studentsList=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            String studentInfo=scanner.nextLine();

            String firstName=studentInfo.split(" ")[0];
            String lastName=studentInfo.split(" ")[1];
            double grade= Double.parseDouble(studentInfo.split(" ")[2]);

            Students students= new Students(firstName,lastName,grade);
            studentsList.add(students);

        }

        studentsList.sort(Comparator.comparing(Students::getGrade).reversed());

        for (Students student:studentsList) {
            System.out.println(student.toString());
        }

    }
}
