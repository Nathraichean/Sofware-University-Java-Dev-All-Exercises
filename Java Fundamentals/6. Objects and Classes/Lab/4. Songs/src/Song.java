public class Song {
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
