package maratona_java.javacore.Oexcecoes.exception.test;

import maratona_java.javacore.Oexcecoes.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvaldoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }
    public static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String userNameBD = "leo";
        String senha = "123";
        System.out.println("usuario:");
        String nomeDigitado = teclado.nextLine();
        System.out.println("senha");
        String senhaDigitada = teclado.nextLine();
        if (!userNameBD.equals(nomeDigitado) || !senha.equals(senhaDigitada)){
            throw new LoginInvalidoException("login ou senha inválidos");
        }
        System.out.println("usuário logado com sucesso");
    }
}
