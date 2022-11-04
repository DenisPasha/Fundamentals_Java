package P07AssociativeArrays.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());

        Map<String ,String > map=new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String command = scanner.nextLine();

            if (command.split(" ")[0].equals("register")){

                String user=command.split(" ")[1];
                String plate=command.split(" ")[2];

                if (!map.containsKey(user)){
                    map.put(user,plate);
                    System.out.printf("%s registered %s successfully%n",user,plate);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n",map.get(user));
                }

            } else if (command.split(" ")[0].equals("unregister")) {

                String plate=command.split(" ")[1];
                boolean isRemoved=false;
                String user="";
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey().equals(plate)){
                         user = entry.getKey();
                        map.remove(user);
                        System.out.printf("%s unregistered successfully%n",user);
                        isRemoved=true;
                        break;
                    }
                }
                if (!isRemoved){
                    System.out.printf("ERROR: user %s not found%n",plate);
                }

            }
        }

        map.entrySet().forEach(stringStringEntry -> System.out.printf("%s => %s%n",stringStringEntry.getKey(),stringStringEntry.getValue()));

    }
}
