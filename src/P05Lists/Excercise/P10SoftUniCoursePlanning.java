package P05Lists.Excercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>inputList= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command=scanner.nextLine();

        while (!command.equals("course start")){


            List<String>commandList= List.of(command.split(":"));

            if (command.contains("Add:")){
                String object= commandList.get(1);

                boolean alreadyInList=true;
                for (int i = 0; i < inputList.size(); i++) {
                    String currentElement=inputList.get(i);

                    if (currentElement.equals(object)){
                        alreadyInList=false;
                    }
                }
                if (alreadyInList){
                    inputList.add(object);
                }

            } else if (command.contains("Insert:")) {

                boolean notInList=true;
                int index= Integer.parseInt(commandList.get(2));

                for (int i = 0; i < inputList.size(); i++) {
                    String currentElement=inputList.get(i);

                    if (currentElement.equals(commandList.get(1))){
                        notInList=false;
                    }
                }
                if (notInList){
                    inputList.add(index,commandList.get(1));
                }


            } else if (command.contains("Remove:")) {
                String object= commandList.get(1);

                for (int i = 0; i < inputList.size(); i++) {
                    String currentElement=inputList.get(i);
                    if (object.equals(currentElement)){
                        inputList.remove(i);
                        for (int j = i+1; j < inputList.size(); j++) {
                            String currentElement2=inputList.get(j);
                            if (currentElement2.equals(object+"-Exercise")){
                                inputList.remove(j);
                            }
                        }
                    }

                }


            } else if (command.contains("Swap:")) {
                String element1= commandList.get(1);
                String element2= commandList.get(2);

                for (int i = 0; i < inputList.size(); i++) {

                    String currentElement=inputList.get(i);

                    if (currentElement.equals(element1)){

                        for (int j = i+1; j < inputList.size(); j++) {
                            String currentElement2=inputList.get(j);
                            if (element2.equals(currentElement2)){

                                inputList.set(i,element2);
                                inputList.set(j,element1);

                                for (int k = i+2; k < inputList.size(); k++) {
                                    String element=inputList.get(k);
                                    if (element.equals(element2+"-Exercise")){
                                        inputList.add(i+1,element);
                                        inputList.remove(k+1);
                                        break;
                                    } else if (element.equals(element1+"-Exercise")){
                                        inputList.add(j+1,element);
                                        inputList.remove(k+1);
                                        break;
                                    }
                                }

                            }
                        }
                    }
                }
            } else if (command.contains("Exercise:")) {
                String lessonTitle= commandList.get(1);

                boolean lessonExist=false;
                int index=0;

                for (int i = 0; i < inputList.size(); i++) {
                    String currentElement=inputList.get(i);

                    if (currentElement.equals(lessonTitle)){
                        lessonExist=true;
                        index=i;

                    }

                }
                if (lessonExist){
                    String concatExercise=lessonTitle+"-Exercise";
                    inputList.set(index,concatExercise);
                }else {
                    inputList.add(lessonTitle);
                    String concatExercise=lessonTitle+"-Exercise";
                    inputList.add(concatExercise);
                }

            }


            command=scanner.nextLine();
        }

        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(i+1+"."+inputList.get(i));
        }


    }
}
