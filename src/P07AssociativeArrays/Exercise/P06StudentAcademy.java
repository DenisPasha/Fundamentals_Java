package P07AssociativeArrays.Exercise;

import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String , List<Double>> map=new LinkedHashMap<>();
        List<Double>gradeList;

        for (int i = 1; i <=n ; i++) {
            String name=scanner.nextLine();
            double grade= Double.parseDouble(scanner.nextLine());

            if (!map.containsKey(name)){
                map.put(name,new ArrayList<>());
                map.get(name).add(grade);
            }else {
                map.get(name).add(grade);
            }

        }



        Map<String , Double>aboveAvgMap=new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {

            double avg = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();

            if (avg >= 4.50){
                aboveAvgMap.put(entry.getKey(),avg);
            }
        }
        aboveAvgMap.entrySet().forEach(stringListEntry -> System.out.printf("%s -> %.2f%n",stringListEntry.getKey(),stringListEntry.getValue()));




    }
}
