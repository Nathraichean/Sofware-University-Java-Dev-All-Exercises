/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        ArrayList<Song> songsList = new ArrayList<>();

        boolean end = false;

        while (!end){

            String[] input = scanner.nextLine().split("_");

            String type = input[0];
            String name = input[1];
            String length = input[2];
            Song currentSong = new Song(type,name,length);

        }

        String command = scanner.nextLine();

        switch (command){

            case "listenLater" :

                for (Song song :
                        songsList) {
                    if (song.getType().equals("listenLater")){
                        System.out.println(song.getSongName());
                    };
                }

                break;
            case "favourite":
                for (Song song :
                        songsList) {
                    if (song.getType().equals("favourite")){
                        System.out.println(song.getSongName());
                    };
                }
                break;
            case "all":
                for (Song song :
                        songsList) {

                        System.out.println(song.getSongName());

                }

                break;
            case "time":
                for (Song song :
                        songsList) {

                    System.out.println(song.getMinutesLength());

                }

                break;

        }

    }
}
