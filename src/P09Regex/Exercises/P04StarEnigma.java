package P09Regex.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        StringBuilder decryptedBuilder=new StringBuilder();

        List<String>attackedPlanetsList=new ArrayList<>();
        List<String>destroyedPlanetsList=new ArrayList<>();


        for (int i = 1; i <=n ; i++) {
            String encryptedMessage=scanner.nextLine();

            int decryptByDigitNum=decryptDigit(encryptedMessage);

            for (int j = 0; j <encryptedMessage.length() ; j++) {
                char currentChar=encryptedMessage.charAt(j);

                char encryptChar= (char) (currentChar - decryptByDigitNum);
                decryptedBuilder.append(encryptChar);

            }

            String decryptedMessage=decryptedBuilder.toString();
            String regex="@(?<planet>[A-Z][a-z]+)[^@!,:>-]*:[^@!,:>-]*(?<population>\\d+)[^@!,:>-]*![^@!,:>-]*(?<atackType>[A,D])![^@!,:>-]*->(?<soldierCount>\\d+)";
            Pattern pattern= Pattern.compile(regex);
            Matcher matcher= pattern.matcher(decryptedMessage);

            while (matcher.find()){

                if (matcher.group("atackType").equals("A")){
                    attackedPlanetsList.add(matcher.group("planet"));
                } else if (matcher.group("atackType").equals("D")) {
                    destroyedPlanetsList.add(matcher.group("planet"));
                }

            }
            decryptedBuilder.delete(0,decryptedBuilder.length());
            decryptedMessage="";

        }

        List<String> sortetAttackedPlanetsList = attackedPlanetsList.stream().sorted().collect(Collectors.toList());
        List<String> sortetDestroyedPlanetsList = destroyedPlanetsList.stream().sorted().collect(Collectors.toList());

        System.out.printf("Attacked planets: %d%n",attackedPlanetsList.size());
        if (attackedPlanetsList.size() > 0){
            for (int i = 0; i < sortetAttackedPlanetsList.size(); i++) {
                String currentPlanet=sortetAttackedPlanetsList.get(i);

                System.out.printf("-> %s%n",currentPlanet);
            }
        }
        System.out.printf("Destroyed planets: %d%n",destroyedPlanetsList.size());
        if (destroyedPlanetsList.size() > 0){
            for (int i = 0; i < sortetDestroyedPlanetsList.size(); i++) {
                String currentPlanet=sortetDestroyedPlanetsList.get(i);

                System.out.printf("-> %s%n",currentPlanet);
            }
        }
    }

    private static int decryptDigit(String encryptedMessage) {

        int decryptByDigit=0;
        for (int j = 0; j <encryptedMessage.length() ; j++) {
            char currentChar=encryptedMessage.charAt(j);


            if (currentChar == 's'){
                decryptByDigit++;
            } else if (currentChar == 't') {
                decryptByDigit++;
            }else if (currentChar == 'a') {
                decryptByDigit++;
            }else if (currentChar == 'r') {
                decryptByDigit++;
            }else if (currentChar == 'S') {
                decryptByDigit++;
            }else if (currentChar == 'T') {
                decryptByDigit++;
            }else if (currentChar == 'A') {
                decryptByDigit++;
            }else if (currentChar == 'R') {
                decryptByDigit++;
            }

        }
        return decryptByDigit;
    }
}
