package P06ObjectAndClasses.Exercises.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<OpinionPoll>personList=new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            String personalInfo=scanner.nextLine();

            String name=personalInfo.split(" ")[0];
            int age= Integer.parseInt(personalInfo.split(" ")[1]);


            if (age > 30){
                OpinionPoll person= new OpinionPoll(name,age);
                personList.add(person);
            }
        }

        for (OpinionPoll persons:personList) {
            System.out.println(persons.getName() +" - "+persons.getAge());
        }
    }
}
