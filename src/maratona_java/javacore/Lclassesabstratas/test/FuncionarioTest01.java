package maratona_java.javacore.Lclassesabstratas.test;

import maratona_java.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import maratona_java.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("leo", 6000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("leo", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
