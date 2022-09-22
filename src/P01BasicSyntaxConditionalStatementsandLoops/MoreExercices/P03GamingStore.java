package P01BasicSyntaxConditionalStatementsandLoops.MoreExercices;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double currentBalance= Double.parseDouble(scanner.nextLine());
        String command=scanner.nextLine();
        double gameSum=0;
        boolean endProgram=false;


        while (!command.equals("Game Time")){

            switch (command){


                case "RoverWatch Origins Edition":
                    if (currentBalance<39.99){
                        System.out.println("Too Expensive");
                    }  else {
                        gameSum=gameSum+39.99;
                        currentBalance=currentBalance-39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                        if (currentBalance==0){
                            endProgram=true;
                        }
                    }
                    break;
                case "CS: OG":
                    if (currentBalance<15.99){
                        System.out.println("Too Expensive");
                    }
                    else {
                        gameSum=gameSum+15.99;
                        currentBalance=currentBalance-15.99;
                        System.out.println("Bought CS: OG");
                        if (currentBalance==0){
                            endProgram=true;
                        }
                    }

                    break;
                case "Zplinter Zell":


                    if (currentBalance<19.99){
                        System.out.println("Too Expensive");
                    }
                    else {
                        gameSum=gameSum+19.99;
                        currentBalance=currentBalance-19.99;
                        System.out.println("Bought Zplinter Zell");
                        if (currentBalance==0){
                            endProgram=true;
                        }
                    }

                    break;
                case "Honored 2":
                    if (currentBalance<59.99){
                        System.out.println("Too Expensive");
                    }
                    else {
                        gameSum=gameSum+59.99;
                        currentBalance=currentBalance-59.99;
                        System.out.println("Bought Honored 2");
                        if (currentBalance==0){
                            endProgram=true;
                        }
                    }

                    break;
                case "RoverWatch":
                    if (currentBalance<29.99){
                        System.out.println("Too Expensive");
                    }
                    else {
                        gameSum=gameSum+29.99;
                        currentBalance=currentBalance-29.99;
                        System.out.println("Bought RoverWatch");
                        if (currentBalance==0){
                            endProgram=true;
                        }
                    }
                    break;

                case "OutFall 4":
                    if (currentBalance<39.99){
                        System.out.println("Too Expensive");
                    }
                    else {
                        gameSum=gameSum+39.99;
                        currentBalance=currentBalance-39.99;
                        System.out.println("Bought OutFall 4");
                        if (currentBalance==0){
                            endProgram=true;
                        }
                    }
                    break;


                default:
                    System.out.println("Not Found");



            }

            if (endProgram){
                break;
            }
            command=scanner.nextLine();

        }
        if (endProgram){
            System.out.println("Out of money!");
        }else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",gameSum,currentBalance);
        }




    }
}
