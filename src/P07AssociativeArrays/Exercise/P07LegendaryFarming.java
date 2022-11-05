package P07AssociativeArrays.Exercise;

import java.util.*;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();

        Map<String , Integer> map=new LinkedHashMap<>();
        Map<String ,Integer>junk=new LinkedHashMap<>();
        boolean isEnough=false;

        map.put("shards",0);
        map.put("fragments",0);
        map.put("motes",0);
       while (true){

           String[]inputData=command.split(" ");

           for (int i = 0; i < inputData.length; i+=2) {

               int itemsCount= Integer.parseInt(inputData[i]);
               String items=inputData[i+1].toLowerCase(Locale.ROOT);

               if (items.equals("shards") || items.equals("fragments")||items.equals("motes")){

                   map.put(items,map.get(items)+itemsCount);
               }else {
                   junk.putIfAbsent(items,0);
                   junk.put(items,junk.get(items)+itemsCount);
               }




               for (Map.Entry<String, Integer> entry : map.entrySet()) {

                   if (entry.getValue()>=250 && entry.getKey().contains("shards")){
                       System.out.printf("Shadowmourne obtained!%n");
                       map.put(entry.getKey(), entry.getValue()-250);
                       isEnough=true;
                       break;
                   } else if (entry.getValue()>=250 && entry.getKey().contains("fragments")) {
                       System.out.printf("Valanyr obtained!%n");
                       map.put(entry.getKey(), entry.getValue()-250);
                       isEnough=true;
                       break;
                   }else if (entry.getValue()>=250 && entry.getKey().contains("motes")) {
                       System.out.printf("Dragonwrath obtained!%n");
                       map.put(entry.getKey(), entry.getValue()-250);
                       isEnough=true;
                       break;
                   }
               }
               if (isEnough){
                   break;
               }



           }

           if (isEnough){
               break;
           }


           command=scanner.nextLine();
       }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }

    }
}
