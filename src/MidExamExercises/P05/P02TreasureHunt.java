package MidExamExercises.P05;

import java.util.Arrays;
import java.util.Scanner;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String[] inputArr= input.split("\\|");

        String command=scanner.nextLine();


        while (!command.contains("Yohoho!")){

            String[] commandArr= command.split("\\s");

            if (commandArr[0].equals("Loot")){
                String newItemsToInsert="";
                //getting the loot to string
                String subListOfCommand="";

                for (int i = 1; i < commandArr.length; i++) {
                    subListOfCommand+=commandArr[i]+" ";
                }
                //new loot to array
                String[] newLootArr=subListOfCommand.split(" ");

                //looping and checking if any of the new loot already exist in the main loot
                for (int i = 0; i < newLootArr.length; i++) {
                    String currentNewLoot=newLootArr[i];
                    boolean doesnExist=true;

                    //comparing every loot from new to old
                    for (int j = 0; j < inputArr.length; j++) {

                        String currentLoot=inputArr[j];

                        if (currentLoot.equals(currentNewLoot)){
                            doesnExist=false;
                        }

                    }
                    //concatenating new loot to a string
                    if (doesnExist){
                        newItemsToInsert+=currentNewLoot+" ";
                    }
                }

                //new items
                String[]newItems=newItemsToInsert.split(" ");

                String[]newInputArr=new String[inputArr.length-1+newLootArr.length];


                //reversing the initial concatanated array
                String []ch=newItemsToInsert.split(" ");
                String[] reversed=new String[ch.length];

                int j= ch.length;
                for (int i = 0; i < ch.length  ; i++) {
                    reversed[j - 1] = ch[i];
                    j = j - 1;
                }

                //copying two arrays to new one
                for (int i = 0; i < reversed.length; i++) {
                    newInputArr[i]=reversed[i];
                }
                for (int i = 0; i < inputArr.length; i++) {

                    newInputArr[i+newItems.length]=inputArr[i];
                }

                //updating the old array with new ones elements
                inputArr=null;
                inputArr=newInputArr;

            } else if (commandArr[0].equals("Drop")) {

                int index= Integer.parseInt(commandArr[1]);

                if (index > 0 && index <= inputArr.length-1){

                    String dropLoot=inputArr[index];

                    for (int i = index; i < inputArr.length-1; i++) {
                        inputArr[i]=inputArr[i+1];
                    }
                    inputArr[inputArr.length-1]=dropLoot;

                }

            } else if (commandArr[0].equals("Steal")) {

                int count= Integer.parseInt(commandArr[1]);

                //checking if index is bigger then array length
                if (count > inputArr.length){
                    for (String items:inputArr) {
                        System.out.print(items+", ");
                    }
                    inputArr=null;
                }else {
                    //updating main array
                    String[]tempArr=new String[inputArr.length-count];
                    for (int i = 0; i < inputArr.length-count; i++) {

                        tempArr[i]=inputArr[i];

                    }

                    //printing the removed elements
                    for (int i = inputArr.length-count; i < inputArr.length-1 ; i++) {
                        System.out.print(inputArr[i]+", ");
                    }

                    for (int i = inputArr.length-1; i < inputArr.length ; i++) {
                        System.out.print(inputArr[i]);
                    }
                    System.out.println();
                    inputArr=null;
                    inputArr=tempArr;
                }

            }


            command=scanner.nextLine();
        }

        int sum=0;
        double totalSum=0;
        for (int i = 0; i < inputArr.length; i++) {
            String currentElement=inputArr[i];

            sum+=currentElement.length();
        }
        totalSum=sum*1.0 / inputArr.length;

        if (inputArr.length < 1){
            System.out.println("Failed treasure hunt.");
        }else {
            System.out.printf("Average treasure gain: %.2f pirate credits.",totalSum);
        }


    }
}
