package P05Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>distances=Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum=0;

        while (distances.size()>0){
            int inputIndex=Integer.parseInt(scanner.nextLine());

            int element=0;
            if (isValid(inputIndex,distances)){
                element =distances.get(distances.size()-1);
            }else {
                 element=distances.get(inputIndex);
                distances.remove(inputIndex);
            }

            sum=sum+element;

            for (int i = 0; i < distances.size(); i++) {
                int currentElement=distances.get(i);
                if (currentElement <= element){
                    distances.set(i,currentElement+element);
                }else {
                    distances.set(i,currentElement-element);
                }
            }

        }

        System.out.println(sum);

    }
    private static boolean isValid(int inputIndex,List<Integer>distances){
        boolean indexIsInvalid=false;
        if (inputIndex < 0){
            int lastElement=distances.get(distances.size()-1);
            distances.set(0,lastElement);
        } else if (inputIndex > distances.size()-1) {
            int firstElement=distances.get(0);
            distances.set(distances.size()-1,firstElement);
            indexIsInvalid=true;
        }
        return  indexIsInvalid;
    }
}
