package P06ObjectAndClasses.lab;

import java.util.*;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        List<String>inputList= new ArrayList<>(List.of(input.split(" ")));



        while (!inputList.isEmpty()){

            Random random= new Random();
            int randomIndex=random.nextInt(inputList.size());
            System.out.println(inputList.get(randomIndex));

            inputList.remove(randomIndex);


        }



    }
}
