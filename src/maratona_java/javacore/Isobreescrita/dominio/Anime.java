package maratona_java.javacore.Isobreescrita.dominio;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    @Override// sempre colocar override para ter certeza que o método está sendo sobrescrito
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
