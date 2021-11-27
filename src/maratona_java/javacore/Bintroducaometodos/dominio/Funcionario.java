package maratona_java.javacore.Bintroducaometodos.dominio;
/*
crie uma classe funcionario com os seguintes atributos:

nome
idade
salario = três salários devem serem guardados

1 - criar um método para imprimir os dados
2 - imprimir a média dos três salários
 */

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    double media = 0;// média não pode ter o método set porque só pode ser alterada pelo o obejto atravé do cálculo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia(){
        return media;
    }

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null){// caso não seja passado nenhum salário
            return;
        }
        for (double salario: salarios){
            System.out.println(salario +" ");
        }
        calculaMediaSalarial();
    }

    public void calculaMediaSalarial(){
        if (salarios == null){
            return;
        }
        for (double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nmédia salarial: "+media);
    }
}