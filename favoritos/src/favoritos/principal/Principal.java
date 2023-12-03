package minhasmusicas.principal;

import minhasmusicas.modelos.MinhasPreferidas;
import minhasmusicas.modelos.Musica;
import minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("nothing else matters");
        minhamusica.setCantor("Metalica");

        for (int i = 0; i < 1000 ; i++) {
            minhamusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhamusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhamusica);
    }
}
