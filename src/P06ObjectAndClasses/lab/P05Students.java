package P06ObjectAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {

    static class Student{
        String fName;
        String lName;
        String age;
        String town;

        public String getfName() {
            return fName;
        }

        public String getlName() {
            return lName;
        }

        public String getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }

        public Student(String fName, String lName, String age, String town) {
            this.fName = fName;
            this.lName = lName;
            this.age = age;
            this.town = town;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();

        List<Student>studentList=new ArrayList<>();

        while (!command.equals("end")){

            String[] inputArr=command.split(" ");

            String fName=inputArr[0];
            String lName=inputArr[1];
            String age=inputArr[2];
            String town = inputArr[3];

            Student currentStudent= new Student(fName,lName,age,town);



            studentList.add(currentStudent);




            command=scanner.nextLine();
        }
        String city=scanner.nextLine();

        for (Student student:studentList) {
            if (student.getTown().equals(city)){
                System.out.printf("%s %s is %s years old%n",student.getfName(),student.getlName(),student.getAge());
            }
        }

    }
}
