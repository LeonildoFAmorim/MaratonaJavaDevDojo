package maratona_java.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250; // static: o atributo pertence à classe, e todos os objetos dessa classe terão o valor de 250

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("--------------------");
        System.out.println("nome: " + this.nome);
        System.out.println("velocidade máxima:" + this.velocidadeMaxima);
        System.out.println("velocidade limite: " + Carro.velocidadeLimite);
    }
    // da mesma maneira que os atributos, métodos estáticos pertecem a classe e não ao objeto portanto não pode ser usado o this
    // podemos criar métodos estáticos quando eles não acessam atributos de instância no exemplo aqui seria velocidadeLimite (não é do objeto e sim da classe)
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite; // dentro de um método estático não podemos acessar atributos não estáticos
    }

    public double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
