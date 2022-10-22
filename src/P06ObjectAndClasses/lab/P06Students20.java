package P06ObjectAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students20 {

    static class Students{

        String firstName;
        String lastName;
        String age;
        String town;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }

        public Students(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        List<Students>studentsList=new ArrayList<>();

        while (!command.equals("end")){

            String[]commandArr=command.split(" ");

            String firstName=commandArr[0];
            String lastName=commandArr[1];
            String age=commandArr[2];
            String town=commandArr[3];

            Students students= new Students(firstName,lastName,age,town);
            boolean alreadyExist=false;
            for (Students currentStudent:studentsList) {
                if (students.getFirstName().equals(currentStudent.getFirstName()) && students.getLastName().equals(currentStudent.getLastName())){
                    alreadyExist=true;
                }
            }

            if (!alreadyExist){
                studentsList.add(students);
            }



            command=scanner.nextLine();
        }

        String city=scanner.nextLine();

        for (Students students:studentsList) {
            if (students.getTown().equals(city)){
                System.out.printf("%s %s is %s years old%n",students.getFirstName(),students.getLastName(),students.getAge());
            }
        }

    }
}
