public class Musica extends Audio {
    public String album;
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    private String artista;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    private String genero;

    @Override
    public int getClassificao() {
        if(this.getTotalReproducoes() > 100) {
            return 10;
        } else {
            return 7;
        }
    }
}
