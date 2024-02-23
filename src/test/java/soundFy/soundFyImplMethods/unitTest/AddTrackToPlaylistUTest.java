package soundFy.soundFyImplMethods.unitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import soundFy.controller.factory.InitFactory;
import soundFy.controller.factory.TracksFactory;
import soundFy.model.aplication.SoundFy;
import soundFy.model.aplication.SoundFyImpl;
import soundFy.model.domain.Playlist;
import soundFy.model.domain.Track;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTrackToPlaylistUTest {

    private SoundFy soundFy;
    private List<Playlist> playlistsSel;
    private Track trackToAdd;

    @BeforeEach
    void setUp() {
        soundFy = new SoundFyImpl();
        InitFactory initFactory = new InitFactory();
        playlistsSel = initFactory.initFactoryPlaylists(soundFy, 1);

        TracksFactory trackF = new TracksFactory();
        var handle = trackF.generateListTracksRnd(1);
        trackToAdd = handle.get(0);
    }

    @Test
    void testAddTrackToPlaylist() {
        Playlist playlistSel = playlistsSel.get(0);
        int originalSize = soundFy.getTracks(playlistSel).size();
        soundFy.addTrackToPlaylist(playlistSel, trackToAdd);

        List<Track> tracksInPlaylist = soundFy.getTracks(playlistSel);

        assertEquals(originalSize + 1, soundFy.getTracks(playlistSel).size());

        Assertions.assertFalse(soundFy.getTracks(playlistSel).isEmpty());

        assertEquals(trackToAdd, tracksInPlaylist.get(tracksInPlaylist.size() - 1));
    }
}
