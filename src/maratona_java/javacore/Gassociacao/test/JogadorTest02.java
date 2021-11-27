package maratona_java.javacore.Gassociacao.test;

import maratona_java.javacore.Gassociacao.dominio.Jogador;
import maratona_java.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
       Jogador jogador = new Jogador("cafu");
       Time time = new Time("palmeiras");
       jogador.setTime(time);
       jogador.imprime();
    }
}
