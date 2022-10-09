package P05Lists.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>fList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer>sList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int min=Math.min(fList.size(),sList.size());


        List<Integer>merged=new ArrayList<>();

        for (int i = 0; i < min ; i++) {
            merged.add(fList.get(i));
            merged.add(sList.get(i));
        }

        if (fList.size()>sList.size()){
            merged.addAll(fList.subList(min,fList.size()));
        }else {
            merged.addAll(sList.subList(min,sList.size()));
        }

        for (int item:merged) {
            System.out.print(item+" ");
        }

    }
}
