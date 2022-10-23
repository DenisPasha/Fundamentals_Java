package P06ObjectAndClasses.Exercises.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        List<OrderByAge>personsList=new ArrayList<>();

        while (!input.equals("End")){

            String name=input.split(" ")[0];
            String id=input.split(" ")[1];
            int  age= Integer.parseInt(input.split(" ")[2]);

            OrderByAge person=new OrderByAge(name,id,age);
            personsList.add(person);

            input=scanner.nextLine();
        }
        personsList.sort(Comparator.comparing(OrderByAge::getAge));

        for (OrderByAge person:personsList) {
            System.out.println(person.toString());
        }

    }
}
