package P07AssociativeArrays.Exercise;

import java.beans.IntrospectionException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        int lineCount=0;
        String previousMetal = "";
        Map<String,Integer>map=new LinkedHashMap<>();


        while (!command.equals("stop")){
            lineCount++;

            if (lineCount % 2!=0){
                map.putIfAbsent(command,0);
                previousMetal=command;
            } else {
                map.put(previousMetal,map.get(previousMetal) +Integer.valueOf(command));
            }


            command=scanner.nextLine();
        }

        map.entrySet().forEach(stringIntegerEntry -> System.out.printf("%s -> %d%n",stringIntegerEntry.getKey(),stringIntegerEntry.getValue()));
    }
}
