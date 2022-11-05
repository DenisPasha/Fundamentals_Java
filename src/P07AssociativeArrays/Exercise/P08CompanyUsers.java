package P07AssociativeArrays.Exercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        Map<String , List<String>>map=new LinkedHashMap<>();


        while (!command.equals("End")){

            String[]commandArr=command.split(" -> ");
            String company=commandArr[0];
            String id=commandArr[1];

            map.putIfAbsent(company,new ArrayList<>());
            boolean alreadyExist=false;

            for (int i = 0; i < map.get(company).size(); i++) {
                String currentId=map.get(company).get(i);

                if (currentId.equals(id)){
                    alreadyExist=true;
                }
            }
            if (!alreadyExist){
                map.get(company).add(id);
            }


            command=scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.printf("%s",entry.getKey());
            System.out.println();

            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n",entry.getValue().get(i));
            }


        }

    }
}
