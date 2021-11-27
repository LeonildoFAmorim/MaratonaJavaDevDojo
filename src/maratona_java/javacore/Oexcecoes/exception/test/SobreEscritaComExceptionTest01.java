package maratona_java.javacore.Oexcecoes.exception.test;

import maratona_java.javacore.Oexcecoes.exception.dominio.Funcionario;
import maratona_java.javacore.Oexcecoes.exception.dominio.LoginInvalidoException;
import maratona_java.javacore.Oexcecoes.exception.dominio.Pessoa;

public class SobreEscritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();


        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
