package maratona_java.AApraticando.exercicio2excecao.dominio;

// Exceptio é obrigado a tratar
// RuntimeException não é obrigado a tratar
// para testar basta mudar a extensão aqui entre uma e outra

public class ExcecaoDeNegocio extends Exception{
    public ExcecaoDeNegocio(String mensagem){
        super (mensagem);
    }
}
