package P08TextProcessing.MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String article=scanner.nextLine();
        String content=scanner.nextLine();
        String comments=scanner.nextLine();

        StringBuilder html=new StringBuilder();
        List <String>commentsList=new ArrayList<>();
        int commentsCounter=0;

        while (!comments.equals("end of comments")){

            commentsList.add(comments);
            commentsCounter++;

            comments=scanner.nextLine();
        }

        System.out.printf("<h1>\n" +
                "    %s\n" +
                "</h1>\n",article);

        System.out.printf("<article>\n" +
                "%s\n" +
                "</article>\n",content);
        for (int i = 0; i < commentsCounter ; i++) {
            String comment=commentsList.get(i);
            System.out.printf("<div>\n" +
                    "%s\n" +
                    "</div>\n",comment);
        }



    }
}
