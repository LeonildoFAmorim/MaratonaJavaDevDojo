package maratona_java.javacore.Csobrecargademetodos.test;

import maratona_java.javacore.Csobrecargademetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("festa na fazenda","diversão",10);
        anime.init("festa na fazenda","diversão",10,"infantil");
        anime.imprime();
    }
}
