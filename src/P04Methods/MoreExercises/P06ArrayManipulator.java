package P04Methods.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P06ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int[] inputArray= Arrays.stream(scanner.nextLine().split(" "))
                 .mapToInt(Integer::parseInt)
                 .toArray();
         String command=scanner.nextLine();

         while (!command.equals("end")){
             
             if (command.contains("exchange")){
                 String []commandArr=command.split(" ");
                 int index= Integer.parseInt(commandArr[1]);
                 if (index>=inputArray.length-1){
                     System.out.println("Invalid index");
                 }else {
                     int[]newAr=exchange(inputArray,command);
                     for (int item:newAr) {
                         System.out.print(item+" ");
                     }
                 }
             } else if (command.contains("max odd")) {
                 System.out.println(maxOddIndex(inputArray));

             } else if (command.contains("min odd")) {
                 System.out.println(minOdd(inputArray));

             } else if (command.contains("min even")) {
                 System.out.println(minEven(inputArray));

             } else if (command.contains("max even")) {
                 System.out.println(maxEven(inputArray));

             } else if (command.contains("first") && command.contains("even")) {
                 String [] commandArr=command.split(" ");
                 int index= Integer.parseInt(commandArr[1]);

                 for (int item:firstEven(inputArray,index)) {
                     System.out.print(item+" ");
                 }

             } else if (command.contains("first") && command.contains("odd")) {
                 String [] commandArr=command.split(" ");
                 int index= Integer.parseInt(commandArr[1]);

                 for (int item:firstOdd(inputArray,index)) {
                     System.out.print(item+" ");
                 }
             } else if (command.contains("last") && command.contains("even")) {
                 String [] commandArr=command.split(" ");
                 int index= Integer.parseInt(commandArr[1]);

                 for (int item:lastEven(inputArray,index)) {
                     System.out.print(item+" ");
                 }
             } else if (command.contains("last") && command.contains("odd")) {
                 String [] commandArr=command.split(" ");
                 int index= Integer.parseInt(commandArr[1]);

                 for (int item:lastOdd(inputArray,index)) {
                     System.out.print(item+" ");
                 }
             }
             command=scanner.nextLine();
         }

    }

    private static int[] exchange(int[] inputArray, String command){

        String []commandArr=command.split(" ");
        int index= Integer.parseInt(commandArr[1]);

        int[] tempArray=new int[inputArray.length];
        int fElement=0;

        for (int i = 0; i <= index; i++) {
            fElement=inputArray[0];
            for (int j = 0; j < inputArray.length-1; j++) {
                tempArray[j]=inputArray[j+1];
            }
            tempArray[tempArray.length-1]=fElement;
        }
        return tempArray;

    }

    private static int maxOddIndex(int[] inputArray){

        int currentNum=0;
        int max=Integer.MIN_VALUE;
        int index=0;
        for (int i = 0; i < inputArray.length; i++) {
             currentNum=inputArray[i];

            if (currentNum % 2!=0){
                if (currentNum>max){
                    max=currentNum;
                }
            }
        }
        for (int j = 0; j < inputArray.length; j++) {
            if (max==inputArray[j]){
                index=j;
            }
        }
        return index;
    }

    private static int minOdd(int[] inputArray){
        int currentNum=0;
        int min=Integer.MAX_VALUE;
        int index=0;
        for (int i = 0; i < inputArray.length; i++) {
            currentNum=inputArray[i];

            if (currentNum % 2!=0){
                if (currentNum>min){
                    min=currentNum;
                }
            }
        }
        for (int j = 0; j < inputArray.length; j++) {
            if (min==inputArray[j]){
                index=j;
            }
        }

        return index;
    }

    private static int minEven(int[] inputArray){
        int currentNum=0;
        int min=Integer.MAX_VALUE;
        int index=0;
        for (int i = 0; i < inputArray.length; i++) {
            currentNum=inputArray[i];

            if (currentNum % 2==0){
                if (currentNum>min){
                    min=currentNum;
                }
            }
        }
        for (int j = 0; j < inputArray.length; j++) {
            if (min==inputArray[j]){
                index=j;
            }
        }

        return index;
    }


    private static int maxEven(int[] inputArray){

        int currentNum=0;
        int max=Integer.MIN_VALUE;
        int index=0;
        for (int i = 0; i < inputArray.length; i++) {
            currentNum=inputArray[i];

            if (currentNum % 2==0){
                if (currentNum>max){
                    max=currentNum;
                }
            }
        }
        for (int j = 0; j < inputArray.length; j++) {
            if (max==inputArray[j]){
                index=j;
            }
        }
        return index;
    }

    private static int[] firstEven(int[] inputArray, int count){

        int currentNum=0;
        int[] firstCountEvenArr=new int[count];

        for (int i = 0; i <count ; i++) {

            for (int j = i; j < inputArray.length; j++) {
                currentNum=inputArray[j];
                if (currentNum % 2==0){
                    firstCountEvenArr[i]=currentNum;
                    break;
                }

            }
        }
        return firstCountEvenArr;
    }

    private static int[] firstOdd(int[] inputArray, int count){

        int currentNum=0;
        int[] firstCountOddArr=new int[count];

        for (int i = 0; i <count ; i++) {

            for (int j = i; j < inputArray.length; j++) {
                currentNum=inputArray[j];
                if (currentNum % 2!=0){
                    firstCountOddArr[i]=currentNum;
                    break;
                }

            }
        }
        return firstCountOddArr;
    }

    private static int[] lastEven(int[] inputArray, int count){

        int currentNum=0;
        int[] firstCountOddArr=new int[count];

        for (int i = 0; i <count ; i++) {

            for (int j = inputArray.length-i; j>=i; j--) {
                currentNum=inputArray[j-1];
                if (currentNum % 2==0){
                    firstCountOddArr[i]=currentNum;
                    break;
                }

            }
        }
        //reversing the array
        int [] tempArray=new int[firstCountOddArr.length];
        int j = tempArray.length;
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[j - 1] = firstCountOddArr[i];
            j = j - 1;
        }
        return tempArray;
    }

    private static int[] lastOdd(int[] inputArray, int count){

        int currentNum=0;
        int[] firstCountOddArr=new int[count];

        for (int i = 0; i <count ; i++) {

            for (int j = inputArray.length-i; j>=i; j--) {
                currentNum=inputArray[j-1];
                if (currentNum % 2!=0){
                    firstCountOddArr[i]=currentNum;
                    break;
                }

            }
        }
        //reversing the array
        int [] tempArray=new int[firstCountOddArr.length];
        int j = tempArray.length;
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[j - 1] = firstCountOddArr[i];
            j = j - 1;
        }
        return tempArray;
    }



}
