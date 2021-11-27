package maratona_java.javacore.Gassociacao.test;

import maratona_java.javacore.Gassociacao.dominio.Escola;
import maratona_java.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("leo");
        Professor professor2 = new Professor("li");
        Professor professor3 = new Professor("ma");
        Professor[]professores = {professor1,professor2,professor3};
        Escola escola = new Escola("joaquim",professores);
        escola.imprime();
    }
}
