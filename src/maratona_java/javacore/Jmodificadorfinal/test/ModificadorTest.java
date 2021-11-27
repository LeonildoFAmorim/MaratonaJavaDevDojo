package maratona_java.javacore.Jmodificadorfinal.test;

import maratona_java.javacore.Jmodificadorfinal.dominio.Carro;
import maratona_java.javacore.Jmodificadorfinal.dominio.Ferrari;

public class ModificadorTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("carrão da hora");
        ferrari.imprime();
    }
}
