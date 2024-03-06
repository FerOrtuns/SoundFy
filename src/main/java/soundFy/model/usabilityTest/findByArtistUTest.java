package soundFy.model.usabilityTest;


import soundFy.controller.factory.InitFactory;
import soundFy.model.aplication.SoundFy;
import soundFy.model.aplication.SoundFyImpl;
import soundFy.view.console.PrintPlaylists;

public class findByArtistUTest {


    public static void main(String[] args) {

        SoundFy soundFy = new SoundFyImpl();
        InitFactory.initFactory(soundFy);

        var playlists = soundFy.findByArtist("Standard Alien");


        System.out.println("playlist con temas de Standadrd Alien : ");
        System.out.println("------------------------------------");

        PrintPlaylists.printPlaylists(soundFy, playlists);
    }
}
