package BasicSyntaxConditionalStatementsandLoops.Exercices;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        String username=scanner.nextLine();
        String inputPassword=scanner.nextLine();


        String password="";
        char ch;
        int counter=0;


        for (int i=0; i<=username.length()-1; i++){

           ch = (username.charAt(i));
           password=ch+password;
        }


        while (!inputPassword.equals(password)){


            counter++;
            if (counter==4){
                break;
            }

            System.out.printf("Incorrect password. Try again.");
            System.out.println();
            inputPassword=scanner.nextLine();

        }
        if (counter==4){
            System.out.printf("User %s blocked!",username);
        }else {
            System.out.printf("User %s logged in.",username);
        }



    }
}
