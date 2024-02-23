package soundFy.model.usabilityTest;



import soundFy.controller.factory.InitFactory;
import soundFy.model.aplication.SoundFy;
import soundFy.model.aplication.SoundFyImpl;
import soundFy.model.domain.Playlist;
import soundFy.view.console.PrintPlaylists;

import java.time.LocalDate;
import java.util.List;


public class FindByDatesUTest {

    public static void main(String[] args) {

        SoundFy soundFy = new SoundFyImpl();
        InitFactory initFactory = new InitFactory();
        List<Playlist> playlistsSel = initFactory.initFactoryPlaylists(soundFy, 7);


        var playlist = soundFy.findByDates(LocalDate.of(2020, 01, 01), LocalDate.of(2024, 12, 31));

        System.out.println("FindByDatesUTest : ");
        PrintPlaylists.printPlaylists(soundFy, playlist);
        System.out.println("------------------------------------");
    }
}
