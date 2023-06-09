public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public int getClassificao() {
        if(this.getTotalReproducoes() > 60) {
            return 10;
        } else {
            return 8;
        }
    }
}
