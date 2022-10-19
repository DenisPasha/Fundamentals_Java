package MidExamExercises.P06;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();

        double sumWithoutTax=0;
        String special="special";
        String regular="regular";


        while (!command.equals(special) && !command.equals("regular")){


            double price= Double.parseDouble(command);
            if (price > 0){
                sumWithoutTax+=price;
            }else {
                System.out.println("Invalid price!");
            }


            command=scanner.nextLine();
        }

        double taxes=sumWithoutTax *0.20;
        double sumAfterTax=sumWithoutTax + taxes;

        if (command.equals("special")){

            sumAfterTax=sumAfterTax - sumAfterTax*0.10;
        }
        if (sumAfterTax ==0 ){
            System.out.println("Invalid order!");
        }else {
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$",sumWithoutTax,taxes,sumAfterTax);
        }



    }
}
