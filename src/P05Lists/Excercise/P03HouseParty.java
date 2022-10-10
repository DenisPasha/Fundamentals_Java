package P05Lists.Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<String>names=new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            String command=scanner.nextLine();
            List<String>currentCommand= List.of(command.split(" "));
            boolean isGoing=false;

            if (currentCommand.size()==3){
                isGoing=true;
            }

            if (isGoing){
                String isGoingName=currentCommand.get(0);

                if (names.size()>0){
                    for (int j = 0; j < names.size(); j++) {
                        String currentListName=names.get(j);
                        if (isGoingName.equals(currentListName)){
                            System.out.printf("%s is already in the list!",currentListName);
                            System.out.println();

                        }else {
                            names.add(isGoingName);
                            break;
                        }
                    }
                }else {
                    names.add(isGoingName);

                }
            }else {
                boolean isRemoved=false;
                String notGoingName=currentCommand.get(0);
                for (int k = 0; k < names.size(); k++) {

                    String currentListName=names.get(k);
                    if (notGoingName.equals(currentListName)){
                        names.remove(k);
                        isRemoved=true;
                    }
                }
                if (!isRemoved){
                    System.out.printf("%s is not in the list!",notGoingName);
                    System.out.println();
                }


            }
        }
        for (String elements:names) {
            System.out.println(elements);
        }
    }
}
