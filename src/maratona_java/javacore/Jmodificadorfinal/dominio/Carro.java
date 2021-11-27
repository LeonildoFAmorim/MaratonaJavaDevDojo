package maratona_java.javacore.Jmodificadorfinal.dominio;

/*

constantes (final) são escritas neste padrão;
a inicialização é obrigatória, não aceita o valor de inicialização padrão;
o valor inicializado aqui não pode ser mudado no momento da criação do objeto.

Classes com modificado de acesso final não podem serem extendidas;
para que uma classe seja final basta colocar final depois de public;
método final não pode ser sobrescrito;
para que um método seja final basta colocar final depois de public
 */

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    private final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // a classe Ferrari não poderá subescrever este método porque ele é final, ou seja, esse método vai ter o mesmo comportamento para todas as sub classes
    // se quisermos que o método nunca seja subescrito basta que ele seja final
    public final void imprime(){
        System.out.println(this.nome);
    }
}
