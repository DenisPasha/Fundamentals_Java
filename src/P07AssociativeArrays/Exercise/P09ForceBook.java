package P07AssociativeArrays.Exercise;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        Map<String , List<String>>map=new LinkedHashMap<>();


        while (!command.equals("Lumpawaroo")){

            if (command.contains("|")){

                String side=command.split(" | ")[0];
                String user=command.split(" \\| ")[1];

               map.putIfAbsent(side,new ArrayList<>());
               map.get(side).add(user);


            } else if (command.contains("->")) {

                String user=command.split(" -> ")[0];
                String side=command.split(" -> ")[1];

                // removing if exist already
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {

                    for (int i = 0; i < entry.getValue().size(); i++) {
                        String currentUser=entry.getValue().get(i);

                        if (currentUser.equals(user)){
                            map.remove(entry.getKey());
                        }
                    }
                }

                //adding to corresponding side
                boolean noSuchSide=true;


                map.putIfAbsent(side,new ArrayList<>());
                map.get(side).add(user);
                System.out.printf("%s joins the %s side!",user,side);

                System.out.println();




            }


            command=scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());

            for (int i = 0; i < entry.getValue().size(); i++) {
                String currentUser=entry.getValue().get(i);
                System.out.printf("! %s%n",String.join(System.lineSeparator(),entry.getValue().get(i)) );
            }
        }


    }
}
