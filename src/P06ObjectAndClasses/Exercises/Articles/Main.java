package P06ObjectAndClasses.Exercises.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String title=input.split(", ")[0];
        String content=input.split(", ")[1];
        String author=input.split(", ")[2];

        P02Articles articles= new P02Articles(title,content,author);

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {

            String command=scanner.nextLine();
            String currentCommand=command.split(": ")[0];
            String value=command.split(": ")[1];

            if (currentCommand.equals("Edit")){
                articles.edit(value);
            } else if (currentCommand.equals("ChangeAuthor")) {
                articles.changeAuthor(value);
            } else if (currentCommand.equals("Rename")) {
                articles.rename(value);
            }


        }

        System.out.println(articles.toString());
    }
}
