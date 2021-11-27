package maratona_java.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    // apenas para aprendizado, porque o ideal seria manter uma classe só para impressões para manter a coesão
    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println("------------");
    }
}
