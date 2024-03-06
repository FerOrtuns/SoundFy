package soundFy.model.usabilityTest;


import soundFy.controller.factory.InitFactory;
import soundFy.model.aplication.SoundFy;
import soundFy.model.aplication.SoundFyImpl;
import soundFy.model.domain.Playlist;
import soundFy.view.console.PrintPlaylists;

import java.util.List;

public class GetTopArtistsUTest {

    public static void main(String[] args) {

        SoundFy soundFy = new SoundFyImpl();
        InitFactory initFactory = new InitFactory();
        List<Playlist> playlistsSel = initFactory.initFactoryPlaylists(soundFy, 1);
        var playlistSel = playlistsSel.get(0);

        PrintPlaylists.printPlaylists(soundFy, playlistSel);

        var playlist = soundFy.getTopArtists(playlistSel, 5);

        System.out.println("getTopArtists(playlist) : " + playlist.toString());
        System.out.println("------------------------------------");

    }
}
