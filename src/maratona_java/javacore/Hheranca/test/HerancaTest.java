package maratona_java.javacore.Hheranca.test;

import maratona_java.javacore.Hheranca.dominio.Funcionario;
import maratona_java.javacore.Hheranca.dominio.Endereco;
import maratona_java.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("rua papagaio");
        endereco.setCep("2345ty");
        Pessoa pessoa = new Pessoa("leo");


        pessoa.setCpf("123");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("----------------------------");
        Funcionario funcionario = new Funcionario("leonildo");

        funcionario.setCpf("922");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(50000);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
