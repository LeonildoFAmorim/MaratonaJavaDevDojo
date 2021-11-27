package maratona_java.javacore.Npolimorfismo.servico;

import maratona_java.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando no banco de dados");
    }
}
