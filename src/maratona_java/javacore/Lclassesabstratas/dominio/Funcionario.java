package maratona_java.javacore.Lclassesabstratas.dominio;
/*
 - uma classe abstrata não pode ser instanciada, ou seja ser um objeto, porque ela existe para ser extendida.
 - método abstrato não tem corpo, todas as classes filhas desta classe serão forçadas a definir como este método irá funcionar.
 - neste exemplo o gerente tem um bonus de 10% e desenvolvedor tem um bonus de 5%. cada classe subescrevendo esse método
 - uma classe pode ter métodos abstratos e métodos concretos;
 - um método abstrato só pode existir dentro de uma classe abstrata
 */
public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("imprimindo");
    }
}
