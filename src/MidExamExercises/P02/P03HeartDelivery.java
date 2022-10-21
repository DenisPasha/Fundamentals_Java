package MidExamExercises.P02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer>inputList=Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command=scanner.nextLine();

        int allJumpsLength=0;
        while (!command.contains("Love!")){

            List<String>commandList= List.of(command.split(" "));
            int currentJumpLength= Integer.parseInt(commandList.get(1));

            allJumpsLength=allJumpsLength+currentJumpLength;

            if (allJumpsLength >= inputList.size()){
                allJumpsLength=0;
            }

            int currentHouse = inputList.get(allJumpsLength);

            if (currentHouse <=0){
                System.out.printf("Place %d already had Valentine's day.",allJumpsLength);
                System.out.println();
            }else {
                currentHouse=currentHouse-2;
                if (currentHouse <=0){
                    System.out.printf("Place %d has Valentine's day.",allJumpsLength);
                    System.out.println();
                }
            }



            inputList.set(allJumpsLength,currentHouse);



            command=scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.",allJumpsLength);
        System.out.println();

        boolean notSuccesfull=false;
        int count=0;
        for (int i = 0; i < inputList.size(); i++) {
            int currentHouse= inputList.get(i);
            if (currentHouse!=0){
                count++;
                notSuccesfull=true;
            }
        }

        if (notSuccesfull){
            System.out.printf("Cupid has failed %d places.",count);
        }else {
            System.out.println("Mission was successful.");
        }
    }
}
