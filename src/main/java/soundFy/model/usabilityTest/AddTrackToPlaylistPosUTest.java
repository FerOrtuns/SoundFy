package soundFy.model.usabilityTest;



import soundFy.controller.factory.InitFactory;
import soundFy.controller.factory.TracksFactory;
import soundFy.model.aplication.SoundFy;
import soundFy.model.aplication.SoundFyImpl;
import soundFy.model.domain.Playlist;
import soundFy.model.domain.Track;
import soundFy.view.console.PrintPlaylists;

import java.util.List;

public class AddTrackToPlaylistPosUTest {
    public static void main(String[] args) {


        SoundFy soundFy = new SoundFyImpl();
        InitFactory initFactory = new InitFactory();
        List<Playlist> playlistsSel = initFactory.initFactoryPlaylists(soundFy, 1);

        TracksFactory trackF = new TracksFactory();
        var handle = trackF.generateListTracksRnd(1);
        Track trackToAdd = handle.get(0);

        System.out.println("trackToAdd : " + trackToAdd);

        PrintPlaylists.printPlaylists(soundFy, playlistsSel);

        System.out.println("playlist con tema añadido random con posicion 0");
        System.out.println("------------------------------------");

        var playlistSel = playlistsSel.get(0);
        System.out.println("____________________________________________________________________________");
        soundFy.addTrackToPlaylist(playlistSel, -2, trackToAdd);

        PrintPlaylists.printPlaylists(soundFy, playlistsSel);

    }
}
