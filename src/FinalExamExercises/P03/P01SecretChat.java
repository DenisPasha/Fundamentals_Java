package FinalExamExercises.P03;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input=new StringBuilder(scanner.nextLine());

        String command=scanner.nextLine();

        while (!command.contains("Reveal")){
            String[]commandArr=command.split(":\\|:");

            if (command.contains("InsertSpace")){
                int index= Integer.parseInt(commandArr[1]);
                input.insert(index," ");
                System.out.println(input);

            } else if (command.contains("Reverse")) {
                String text= commandArr[1];
               int index = input.indexOf(text);

               if (index!=-1){
                   String exported=input.substring(index,index+text.length());

                   StringBuilder temp=new StringBuilder();
                   for (int i = exported.length()-1; i >=0 ; i--) {

                       temp.append(exported.charAt(i));
                   }

                   for (int i = 0; i <temp.length() ; i++) {
                       input.replace(index,index+i,"");
                   }
                   input.append(temp);

                   System.out.println(input);

               }else {
                   System.out.println("error");
               }


                
            } else if (command.contains("ChangeAll")) {
                String sub= commandArr[1];
                String replacement= commandArr[2];

                String temp= String.valueOf(input);
                temp=temp.replaceAll(sub,replacement);
                input.replace(0,input.length(),temp);
                System.out.println(input);
            }


            command=scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s",input);
    }
}
