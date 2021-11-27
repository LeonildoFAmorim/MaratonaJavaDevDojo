package maratona_java.javacore.Gassociacao.test;

import maratona_java.javacore.Gassociacao.dominio.Jogador;
import maratona_java.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("cafu");
        Jogador jogador2 = new Jogador("pelé");
        Time time = new Time("Brasil");
        Jogador [] jogadores = {jogador1,jogador2};
        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);
        System.out.println("do ponto de vista do jogador");
        jogador1.imprime();
        //jogador2.imprime();

        System.out.println("do ponto de vista do time");
        time.imprime();
    }
}
