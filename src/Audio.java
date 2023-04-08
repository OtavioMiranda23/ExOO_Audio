public class Audio {
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    private int duracao;

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    private int totalReproducoes;

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    private int curtidas;
    private int classificao;

    public int getClassificao() {
        return classificao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        this.curtidas++;
    }
    public void  reproduzir() {
        this.totalReproducoes++;

    }




}
