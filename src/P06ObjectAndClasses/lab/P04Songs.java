package P06ObjectAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {

    static class Song{
        String typeList;
        String name;

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        String time;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfSongs=Integer.parseInt(scanner.nextLine());

        List<Song>songsList=new ArrayList<>();

        for (int i = 1; i <=numOfSongs ; i++) {
            String[]songArr=scanner.nextLine().split("_");

            Song song= new Song();

            song.setTypeList(songArr[0]);
            song.setName(songArr[1]);
            song.setTime(songArr[2]);

            songsList.add(song);


        }
        String command=scanner.nextLine();

       if (command.equals("all")){

           for (Song currentSong:songsList) {
               System.out.println(currentSong.getName());
           }

       }else {
           for (Song currentSong:songsList) {
               if (currentSong.typeList.equals(command)){
                   System.out.println(currentSong.getName());
               }
           }
       }
    }
}
