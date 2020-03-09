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


        for (int i = 0; i < numberOfSongs; i++) {
            String[] input = scanner.nextLine().split("_");

            if (input.length == 3){
                String type = input[0];
                String name = input[1];
                String length = input[2];
                Song currentSong = new Song(type,name,length);
                songsList.add(currentSong);
            }
        }

        String command = scanner.nextLine();

        switch (command){
            case "all":
                for (Song song :
                        songsList) {
                        System.out.println(song.getSongName());
                }
                break;
            default:
                for (Song song :
                        songsList) {
                    if (song.getType().equals(command)){
                        System.out.println(song.getSongName());
                    };
                }
                break;
        }

    }

    public static class Song {
        private String type;
        private String songName;
        private String timeLength;

        public Song(){};
        public Song(String type, String songName, String timeLength){
            this.type = type;
            this.songName = songName;
            this.timeLength = timeLength;
        }

        public String getType(){
            return this.type;
        }
        public void setType(String type){
            this.type = type;
        }

        public String getSongName() {
            return songName;
        }
        public void setSongName(String songName) {
            this.songName = songName;
        }

        public String getMinutesLength() {
            return timeLength;
        }
        public void setMinutesLength(String timeLength) {
            this.timeLength = timeLength;
        }
    }

}


