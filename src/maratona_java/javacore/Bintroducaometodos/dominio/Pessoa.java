package maratona_java.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
