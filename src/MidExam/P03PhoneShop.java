package MidExam;

import java.util.List;
import java.util.Scanner;

public class P03PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phonesInput=scanner.nextLine();
        List<String>inputList= new java.util.ArrayList<>(List.of(phonesInput.split(", ")));

        String command=scanner.nextLine();

        while (!command.contains("End")){

            List<String>commandList= List.of(command.split(" - "));
            String currentCommand=commandList.get(0);
            String phoneCommand=commandList.get(1);

            if (currentCommand.equals("Add")){

                if (!phoneAlreadyExist(inputList,phoneCommand)){
                    inputList.add(phoneCommand);
                }
                
            } else if (currentCommand.equals("Remove")) {

                for (int i = 0; i < inputList.size(); i++) {
                    String currentPhone=inputList.get(i);

                    if (currentPhone.equals(phoneCommand)){
                        inputList.remove(i);
                    }
                }

            } else if (currentCommand.equals("Bonus phone")) {
                List<String>phonesToAdd= List.of(phoneCommand.split(":"));

                String oldPhone = phonesToAdd.get(0);
                String newPhone= phonesToAdd.get(1);

                for (int i = 0; i < inputList.size(); i++) {
                    String currentPhone=inputList.get(i);

                    if (currentPhone.equals(oldPhone)){
                        inputList.add(i+1,newPhone);
                    }
                }

            } else if (currentCommand.equals("Last")) {

                for (int i = 0; i < inputList.size(); i++) {
                    String currentPhone=inputList.get(i);

                    if (currentPhone.equals(phoneCommand)){

                        for (int j = i; j < inputList.size()-1; j++) {
                            inputList.set(j,inputList.get(j+1));
                        }
                        inputList.set(inputList.size()-1,currentPhone);
                    }
                }
            }


            command=scanner.nextLine();
        }

        for (int i = 0; i < inputList.size()-1; i++) {
            System.out.print(inputList.get(i)+", ");
        }

        for (int i = inputList.size()-1; i < inputList.size(); i++) {
            System.out.print(inputList.get(i));
        }

    }

    private static boolean phoneAlreadyExist(List<String> inputList, String phoneCommand){
        boolean phoneAlreadyExist=false;

        for (int i = 0; i < inputList.size(); i++) {
            String currentPhone=inputList.get(i);

            if (currentPhone.equals(phoneCommand)){
                phoneAlreadyExist=true;
            }
        }
        return phoneAlreadyExist;
    }

}
