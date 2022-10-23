package P06ObjectAndClasses.Exercises.Students;

public class Students {


    String firstName;
    String lastName;
    double grade;

    public Students(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f",firstName,lastName,grade);
    }
}
