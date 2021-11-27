package maratona_java.javacore.Lclassesabstratas.dominio;
//o método abstrado imprime precisa ser implementado apenas na classe Funiconario porque ela é subclasse
// desta classe. As classes Desenvolvedor e Gerente não são obrigadas a subescrever este método, é possível, mas não é obrigado.
public abstract class Pessoa {
    public abstract void imprime();
}
