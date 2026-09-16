package Spotify;

public class Song {
    String title;
    String artist;
    int durationInSeconds;

    public Song(String title, String artist, int durationInSeconds){
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;

    }
    void displaySong(){
        System.out.println(title+" by "+artist+" duration "+ durationInSeconds);
    }
}
