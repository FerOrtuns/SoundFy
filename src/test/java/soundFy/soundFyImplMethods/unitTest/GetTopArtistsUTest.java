/*
package test.java.soundFy.soundFyImplMethods.unitTest;

import main.java.soundFy.controller.factory.InitFactory;
import main.java.soundFy.model.aplication.SoundFy;
import main.java.soundFy.model.aplication.SoundFyImpl;
import main.java.soundFy.model.domain.Playlist;
import main.java.soundFy.model.domain.TopArtists;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetTopArtistsUTest {

    private SoundFy soundFy;
    private List<Playlist> playlistsSel;

    @BeforeEach
    void setUp() {
        soundFy = new SoundFyImpl();
        InitFactory initFactory = new InitFactory();
        playlistsSel = initFactory.initFactoryPlaylists(soundFy, 1);
    }

    @Test
    void testGetTopArtists() {
        Playlist playlistSel = playlistsSel.get(0);

        // Probamos obtener el top de artistas con diferentes valores de topN
        for (int topN : new int[]{5, 10, 20}) {
            var topArtists = soundFy.getTopArtists(playlistSel, topN);

            // Verificamos que la lista no sea nula
            assertNotNull(topArtists, "La lista de artistas no debe ser nula");

            // Verificamos que la lista no supere el tamaño máximo
            assertEquals(Math.min(topN, topArtists.size()), topArtists.size(), "La lista de artistas tiene el tamaño esperado");

            // Verificamos que las ocurrencias estén ordenadas correctamente
            int prevOccurrences = Integer.MAX_VALUE;
            for (int i = 0; i < topArtists.size() - 1; i++) {
                int currentOccurrences = topArtists.get(i).getOccurrences();
                assertTrue(currentOccurrences <= prevOccurrences, "Las ocurrencias deben estar ordenadas correctamente");
                prevOccurrences = currentOccurrences;
            }
        }
    }
}
*/
