package maratona_java.javacore.Eblocodeinicializacao.test;

import maratona_java.javacore.Eblocodeinicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("leo");
        System.out.println(anime.getNome());
    }
}
