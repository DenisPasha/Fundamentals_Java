package P03Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P06LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize=Integer.parseInt(scanner.nextLine());

        int[]bugsIndexes= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command=scanner.nextLine();


        int[]fieldArr=new int[fieldSize];

        //validating input index


        //creating the field with bugs
        for (int i = 0; i < bugsIndexes.length; i++) {
            int fieldIndexWithBug=bugsIndexes[i];
            if (fieldIndexWithBug!=0){
                fieldArr[fieldIndexWithBug]=1;
            }
        }

        while (!command.equals("end")){

            String[] commandArr=command.split(" ");

            String indexString="";
            indexString=indexString+ commandArr[0]+" ";
            indexString=indexString+ commandArr[2];

            int[] indexes= Arrays.stream(indexString.split(" ")).mapToInt(Integer::parseInt).toArray();




            //variables from command input
            int indexFrom= Integer.parseInt(commandArr[0]);
            int indexTo= Integer.parseInt(commandArr[2]);
            String side=commandArr[1];

            //validating index

            if ( indexes[0] < fieldSize && indexes[0] >= 0  && fieldArr[indexFrom]==1  ){

                if (side.equals("right")){

                    fieldArr[indexFrom]=0;

                    if (indexFrom+indexTo < fieldSize){
                        if (fieldArr[indexFrom+indexTo]!=1){
                            fieldArr[indexFrom+indexTo]=1;

                    }


                    } else {
                        // if index is busy jump to other one up to the end of array
                        for (int i = 1; i <= fieldSize ; i++) {

                            if (indexFrom+indexTo+i < fieldSize){

                                if (fieldArr[indexFrom+indexTo+i]!=1){
                                    fieldArr[indexFrom+indexTo]=1;
                                    break;
                                }
                            }

                        }
                    }


                } else if (side.equals("left")) {

                    fieldArr[indexFrom]=0;

                    if (fieldArr[indexFrom-indexTo]!=1){
                        fieldArr[indexFrom-indexTo]=1;

                    } else {
                        // if index is busy jump to other one up to the end of array
                        for (int i = 1; i <=fieldSize ; i++) {
                            if (fieldArr[indexFrom-indexTo-i]!=1){
                                fieldArr[indexFrom-indexTo]=1;
                            }
                        }
                    }

                }
            }




            command=scanner.nextLine();
        }

        for (int bug:fieldArr) {
            System.out.print(bug+ " ");
        }




    }

}
