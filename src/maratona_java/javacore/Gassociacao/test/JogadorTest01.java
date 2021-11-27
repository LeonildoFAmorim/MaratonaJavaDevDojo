package maratona_java.javacore.Gassociacao.test;

import maratona_java.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("cafu");
        Jogador jogador2 = new Jogador("roberto carlos");
        Jogador jogador3 = new Jogador("romario");
        Jogador [] jogadores = {jogador1,jogador2,jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
