package P07AssociativeArrays.Exercise;

import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        Map<String , List<String> >map=new LinkedHashMap<>();
        List<String>students;

        while (!command.equals("end")){

            String course=command.split(" : ")[0];
            String student=command.split(" : ")[1];

            if (!map.containsKey(course)){
                map.put(course,new ArrayList<>());
                map.get(course).add(student);
            }else {
                map.get(course).add(student);
            }

            command=scanner.nextLine();
        }


        for (Map.Entry<String, List<String>> entry : map.entrySet()) {

            System.out.printf("%s: %d\n",entry.getKey(),entry.getValue().size());

            for (int i = 0; i < entry.getValue().size(); i++) {
                String currentStudent= entry.getValue().get(i);
                System.out.printf("-- %s%n",currentStudent);
            }

        }

    }
}
