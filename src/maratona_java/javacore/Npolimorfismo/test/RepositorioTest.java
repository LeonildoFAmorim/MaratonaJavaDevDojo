package maratona_java.javacore.Npolimorfismo.test;

import maratona_java.javacore.Npolimorfismo.repositorio.Repositorio;
import maratona_java.javacore.Npolimorfismo.servico.RepositorioArquivo;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();// para que seja impresso o método correspondente a cada objeto basta trocar o nome da Classe new...
        repositorio.salvar();
    }
}
