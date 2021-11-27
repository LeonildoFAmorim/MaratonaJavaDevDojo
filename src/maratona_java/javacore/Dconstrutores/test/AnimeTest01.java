package maratona_java.javacore.Dconstrutores.test;

import maratona_java.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime1 = new Anime("festa na fazenda","animação",10,"infantil");
        Anime anime2 = new Anime("festa na fazenda","animação",10,"infantil",23);
        System.out.println("construtor sem parâmetros");
        anime.imprime();
        System.out.println("construtor com 4 parâmetros");
        anime1.imprime();
        System.out.println("construtor com 5  parâmetros");
        anime2.imprime();
    }
}
