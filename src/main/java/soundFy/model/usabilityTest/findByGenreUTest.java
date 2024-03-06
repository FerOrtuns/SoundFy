package soundFy.model.usabilityTest;


import soundFy.controller.factory.InitFactory;
import soundFy.model.aplication.SoundFy;
import soundFy.model.aplication.SoundFyImpl;
import soundFy.view.console.PrintPlaylists;

public class findByGenreUTest {


    public static void main(String[] args) {

        SoundFy soundFy = new SoundFyImpl();
        InitFactory.initFactory(soundFy);

        var playlists = soundFy.findByGenre("Jazz");
        System.out.println("playlist con el genero Jazz : ");
        System.out.println("------------------------------------");

        PrintPlaylists.printPlaylists(soundFy, playlists);
    }
}