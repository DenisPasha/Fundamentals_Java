package P06ObjectAndClasses.MoreExercises.CompanyRooster;

public class Employee {

    String name;
    double salary;
    String position;
    String department;
    String email;
    int  age;

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
       return String.format("%s %.2f %s %d",name,salary,email,age);
    }
}
