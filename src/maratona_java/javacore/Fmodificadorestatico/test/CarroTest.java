package maratona_java.javacore.Fmodificadorestatico.test;

import maratona_java.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);
        Carro carro1 = new Carro("audi",180);
        Carro carro2 = new Carro("fusca",290);
        Carro carro3 = new Carro("fiesta",220);

       // Carro.velocidadeLimite = 320;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
