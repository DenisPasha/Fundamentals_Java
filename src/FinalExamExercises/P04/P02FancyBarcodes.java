package FinalExamExercises.P04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {

            String input=scanner.nextLine();
            String regex="@[#]+(?<code>[A-Z][A-Za-z0-9]{4,}[A-Z])@[#]+";

            Pattern pattern= Pattern.compile(regex);
            Matcher matcher= pattern.matcher(input);
            boolean codeIsValid=false;

            while (matcher.find()){
                codeIsValid=true;

                StringBuilder productGroup=new StringBuilder();
                boolean hasDigit=false;

                String currentCode= matcher.group("code");
                for (int k = 0; k <currentCode.length() ; k++) {
                    char currentChar=currentCode.charAt(k);

                    if (Character.isDigit(currentChar)){
                        productGroup.append(currentChar);
                        hasDigit=true;
                    }

                }
                if (!hasDigit){
                    productGroup.append("00");
                    System.out.printf("Product group: %s%n",productGroup);
                }else {
                    System.out.printf("Product group: %s%n",productGroup);
                }

            }
            if (!codeIsValid){
                System.out.println("Invalid barcode");
            }
        }


    }
}
