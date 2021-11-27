package maratona_java.javacore.Bintroducaometodos.test;

import maratona_java.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("leo");
        funcionario.setIdade(40);
        funcionario.setSalarios(new double[]{2000,1000,6000});
        funcionario.imprimeDados();
        System.out.println(funcionario.getMedia());
    }
}
