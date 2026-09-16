package Spotify;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    Scanner input = new Scanner(System.in);
    ArrayList<Song> trackList = new ArrayList<>();

    public void addSong(){
        //create three variables and store user input in them
        System.out.println("Add a new song");
        System.out.print("Enter the title of the song:");
        String title = input.nextLine();
        System.out.print("Enter the artist name: ");
        String artist = input.nextLine();
        System.out.print("Enter the duration in sec: ");
        int duration = input.nextInt();
        //now we consume extra spaces left behind
        input.nextLine();

        //create a new song object and pass our variables into it as formal parameters
        Song newlyCreatedSong = new Song(title,artist,duration);
        //now add our object to the arraylist
        trackList.add(newlyCreatedSong);
        System.out.println("Successfully added to your playlist");

    }

    void displayList(){
        if(trackList.isEmpty()){
            System.out.println("You have nothing in your playlist");
        }
        for (int i = 0; i < trackList.size(); i++){
            System.out.print((i+1)+ " ");
           trackList.get(i).displaySong();
        }

        totalSongs();
    }
    void totalSongs(){
        System.out.println(trackList.size());
    }
    void removeSong(){
        if (trackList.isEmpty()){
            System.out.println("Playlist is empty nothing to remove here lol");
        }else {
            displayList();
            System.out.println("Enter the song No to be removed(must be between 1 and "+trackList.size()+ "):");
            int userChoice = input.nextInt();
            int targetIndex = userChoice - 1;
            if (userChoice < 0 || userChoice >= trackList.size()){
                System.out.println("Song cannot be found.Please pick a correct song No");
            }else {
                String targetTitle = trackList.get(targetIndex).title;
                System.out.println("You are about to remove" + targetTitle);
                System.out.println("1.Remove \n2.Cancel");
                int decision = input.nextInt();
                input.nextLine();
                if (decision == 1) {
                    trackList.remove(targetIndex);
                    System.out.println("You have removed" + targetTitle);
                } else {
                    System.out.println("Song removal has been cancelled");
                }
            }
        }

    }
}
