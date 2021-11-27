package maratona_java.javacore.Bintroducaometodos.test;

import maratona_java.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("leonildo");
        pessoa.setIdade(38);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
