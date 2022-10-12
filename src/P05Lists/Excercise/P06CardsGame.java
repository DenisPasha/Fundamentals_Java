package P05Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> firstPlayerList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayerList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());




            for (int i = 0; i < firstPlayerList.size(); i++) {

                while (firstPlayerList.size()!=0 && secondPlayerList.size()!=0) {

                int firstPlayerCurrentCard = firstPlayerList.get(i);
                int secondPlayerCurrentCard = secondPlayerList.get(i);

                // cheks which card is bigger removes it from list and puts 2 at the back of winner
                if (firstPlayerCurrentCard > secondPlayerCurrentCard) {

                    firstPlayerList.remove(i);
                    secondPlayerList.remove(i);
                    firstPlayerList.add(firstPlayerCurrentCard);
                    firstPlayerList.add(secondPlayerCurrentCard);
                    i = 0;


                } else if (firstPlayerCurrentCard < secondPlayerCurrentCard) {
                    firstPlayerList.remove(i);
                    secondPlayerList.remove(i);
                    secondPlayerList.add(secondPlayerCurrentCard);
                    secondPlayerList.add(firstPlayerCurrentCard);
                    i = 0;

                } else {
                    firstPlayerList.remove(i);
                    secondPlayerList.remove(i);
                    i = 0;

                }
            }


        }
            int sum=0;

            if (firstPlayerList.size() > secondPlayerList.size()){
                for (int card:firstPlayerList) {
                    sum+=card;
                }
                System.out.printf("First player wins! Sum: %d",sum);
            }else {
                for (int card:secondPlayerList) {
                    sum+=card;
                }
                System.out.printf("Second player wins! Sum: %d",sum);
            }


    }
}
