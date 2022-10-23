package P06ObjectAndClasses.Exercises.Articles;

public class P02Articles {
    //fields

    String title;
    String content;
    String author;

    // constructor

    public P02Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //methods

    public void edit(String contentIn){
        this.content=contentIn;
    }
    public void changeAuthor(String author){
        this.author=author;
    }
    public void rename(String title){
        this.title=title;
    }

    @Override
    public String toString(){
      return  String.format("%s - %s: %s",this.title,this.content,this.author);

    }



}
