package P06ObjectAndClasses.Exercises;

import java.util.Random;
import java.util.Scanner;

public class P01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String phrases="Excellent product. , Such a great product. , I always use that product. , Best product of its category. " +
                ", Exceptional product. , I can’t live without this product.";

        String events="Now I feel good. , I have succeeded with this product. , Makes miracles. I am happy of the results! , " +
                "I cannot believe but now I feel awesome. , Try it yourself. , I am very satisfied. , I feel great!";

        String authors="Diana , Petya , Stella , Elena , Katya , Iva , Annie , Eva";

        String cities="Burgas , Sofia , Plovdiv , Varna , Ruse";

        for (int i = 1; i <=n ; i++) {

            Random random= new Random();

            //generating random phrase

            int randomNum=random.nextInt(6);
            String randomPhrase=phrases.split(" , ")[randomNum];

            //generating random event

            int randomNumEvent=random.nextInt(7);
            String randomEvent=events.split(" , ")[randomNumEvent];

            // generating random author

            int randomNumAuthor=random.nextInt(8);
            String randomAuthor=authors.split(" , ")[randomNumAuthor];

            // generating random city

            int randomNumCity=random.nextInt(5);
            String randomCity=cities.split(" , ")[randomNumCity];


            System.out.printf("%s %s %s – %s.",randomPhrase,randomEvent,randomAuthor,randomCity);
            System.out.println();
        }

    }
}
