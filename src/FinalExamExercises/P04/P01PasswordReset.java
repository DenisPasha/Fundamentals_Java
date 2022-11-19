package FinalExamExercises.P04;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input=new StringBuilder(scanner.nextLine());
        String command=scanner.nextLine();

        while (!command.equals("Done")){

            if (command.contains("TakeOdd")){

                StringBuilder temp=new StringBuilder();
                for (int i = 0; i <input.length() ; i++) {
                    if (i%2!=0){
                        temp.append(input.charAt(i));
                    }
                }

                input.replace(0,input.length(),"");
                input.append(temp);
                System.out.println(input);
            } else if (command.contains("Cut")) {
                String[] commandArr=command.split(" ");

                int index= Integer.parseInt(commandArr[1]);
                int length= Integer.parseInt(commandArr[2]);

                String sub=input.substring(index,index+length);
                input.replace(index,index+length,"");
                System.out.println(input);

            }else if (command.contains("Substitute")) {

                String[] commandArr=command.split(" ");
                String sub=commandArr[1];
                String replace=commandArr[2];

                String inputS=input.toString();

                if (inputS.contains(sub)){
                    inputS= inputS.replaceAll(sub,replace);

                    input.replace(0,input.length(),"");
                    input.append(inputS);
                    System.out.println(input);
                }else {
                    System.out.printf("Nothing to replace!%n");
                }

            }


            command=scanner.nextLine();
        }
        System.out.printf("Your password is: %s",input);
    }
}
