package maratona_java.javacore.Oexcecoes.exception.dominio;

// como criar exceções customizadas, as vezes o java não terá uma determinada exceção, neste caso precisamos criar a nossa própria exceção
// aí precisamos definir qual o tipo de exceção iremos extender, checked ou unchecked.


public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("login inválido");
    }

    // caso alguém queira uma mensagem customizada basta utilizar esse construtor
    public LoginInvalidoException(String message) {
        super(message);
    }
}
