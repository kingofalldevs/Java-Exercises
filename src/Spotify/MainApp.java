package Spotify;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Playlist playlist = new Playlist();
        boolean userSession = true;

        do {
            System.out.println("-------Spotify-------");
            System.out.println("1.Add Song\n2.Remove Song\n3.List Song:\n4.Exit ");
            int userInput = input.nextInt();

            if (userInput == 1){
                playlist.addSong();
            } else if (userInput ==2) {
                playlist.removeSong();
            }else if(userInput == 3) {
                playlist.displayList();
            }else if (userInput == 4){
                userSession = false;
            }
        }while (userSession);



    }
}
