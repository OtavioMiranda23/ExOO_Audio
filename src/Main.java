public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setAutor("Kiss");

        for (int i = 0; i < 50 ; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 20 ; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 70; i++) {
            meuPodcast.reproduzir();
        }
        for (int i = 0; i < 10; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);

    }
}