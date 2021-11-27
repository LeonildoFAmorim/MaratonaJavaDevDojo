package maratona_java.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    // como a classe pessoa é obrigatoriamente passar um nome, na classe Funcionario também é, porque ela é a subclasse
    public Funcionario(String nome){
        super(nome);// super classe Pessoa
    }

    // sobre escrita de método, onde todos os atributos da super classe serão impresso e por útltimo foi acrescentado o salário
    // sobre escrita de método é o mesmo conceito de sobrecarga de método.
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    static{
        System.out.println("dentro do bloco de inicialização estático de Funcionario");
    }
    {
        System.out.println("dentro do bloco de inicialização não estático de Funcionario");
    }

    public void relatorioPagamento(){
        // é possível acessar o nome nessa classe embora ela não tenha, porque ela extende a classe pessoa e os atributos estão com modificador de acesso protected
        System.out.println("eu: " + this.nome +" recebi o salário de: "+ this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
