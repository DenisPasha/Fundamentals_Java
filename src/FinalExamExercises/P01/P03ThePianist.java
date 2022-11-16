package FinalExamExercises.P01;

import java.util.*;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<String>>map=new LinkedHashMap<>();


        for (int i = 1; i <=n ; i++) {

            String input= scanner.nextLine();
            String[] inputArr=input.split("\\|");

            addPiece(inputArr,map);


        }
        String command=scanner.nextLine();


        while (!command.contains("Stop")){


            if (command.contains("Add")){

                String[] inputArr=command.split("\\|");

                addPiece2(inputArr,map);

            } else if (command.contains("Remove")) {
                String[] inputArr=command.split("\\|");
                String piece=inputArr[1];

                removePiece(piece,map);

            }
            else if (command.contains("ChangeKey")) {
                String[] inputArr=command.split("\\|");

                String piece=inputArr[1];
                String newKey=inputArr[2];

                changeKey(piece,newKey,map);
            }

            command=scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
        }


    }

    private static void changeKey(String piece, String newKey, Map<String, List<String>> map) {
        boolean isChangedKey=false;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String currentPiece= entry.getKey();

            if (currentPiece.equals(piece)){
                map.get(piece).set(1,newKey);
                isChangedKey=true;
                System.out.printf("Changed the key of %s to %s!%n",piece,newKey);
            }
        }
        if (!isChangedKey){
            System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
        }

    }

    private static void removePiece(String piece, Map<String, List<String>> map) {
        boolean removed=false;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String currentPiece= entry.getKey();
            if (piece.equals(currentPiece)){
                map.remove(piece);
                System.out.printf("Successfully removed %s!%n",piece);
                removed=true;
                break;
            }
        }
        if (!removed) {
            System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
        }

    }

    private static void addPiece2(String[] inputArr, Map<String, List<String>> map) {
        String piece=inputArr[1];
        String composer=inputArr[2];
        String key=inputArr[3];

       if (map.containsKey(piece)){
           System.out.printf("%s is already in the collection!%n",piece);
       }else {
           System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
       }

        map.putIfAbsent(piece,new ArrayList<>());
        map.get(piece).add(composer);
        map.get(piece).add(key);




    }

    private static void addPiece(String[] inputArr, Map<String, List<String>> map) {

        String piece=inputArr[0];
        String composer=inputArr[1];
        String key=inputArr[2];

        map.putIfAbsent(piece,new ArrayList<>());
        map.get(piece).add(composer);
        map.get(piece).add(key);


    }
}
