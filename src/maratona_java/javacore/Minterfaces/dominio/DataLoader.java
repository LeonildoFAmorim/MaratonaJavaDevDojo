package maratona_java.javacore.Minterfaces.dominio;

public interface DataLoader {
    void loader(); // por padrão os métodos em interfaces são abstratos e públicos, não precisa colocar como abstratos

    default void checarPermissao(){
        System.out.println("permissão concedida");// os métodos dentro da interface também podem ser concretos, ou seja, podem ser implementados dentro da interface e quem implementar a interface não é obrigado a implementar o método
    }
}
