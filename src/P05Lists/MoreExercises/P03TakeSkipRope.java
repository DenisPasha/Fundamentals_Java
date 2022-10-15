package P05Lists.MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hiddenMessage=scanner.nextLine();

        String numberOnly = hiddenMessage.replaceAll("[^0-9]", "");
        String lettersOnly=hiddenMessage.replaceAll("\\d", "");

        List<Integer>numbersList= Arrays.stream(numberOnly.split("")).map(Integer::parseInt).collect(Collectors.toList());
        List<String>lettersList= List.of(lettersOnly.split(""));

        List<Integer>takeList=new ArrayList<>();
        List<Integer>skipList=new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {
            int currentNumber=numbersList.get(i);
            int index=i;

            if (index % 2==0){
                takeList.add(currentNumber);
            }else {
                skipList.add(currentNumber);
            }
        }

        String message="";
        int indexJ=0;
        //iterating through take list
        for (int i = 0; i < takeList.size(); i++) {
            int charactersToTakeFromLetters=takeList.get(i);


                for (int j = 0; j < charactersToTakeFromLetters; j++) {

                    for (int k = indexJ; k < lettersList.size(); k++) {

                        String currentChar=lettersList.get(k);
                        message=message+currentChar;
                        indexJ++;
                        break;
                    }

                }

            int skipCharacter=0;
            // iterating through skip list
            for (int l = i; l <= i; l++) {
                skipCharacter=skipList.get(l);
                indexJ=indexJ+skipCharacter;
            }

        }
        System.out.println(message);

    }
}
