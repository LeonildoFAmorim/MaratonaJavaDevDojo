package maratona_java.javacore.Hheranca.dominio;

public class Pessoa {
    // o modificador protected permite que as classe que extendem Pessoa tenham acesso ao atributo sem ser necessário utilizar o get. OBS.: mas isso ocorre apenas para as classe que estão dentro do mesmo pacote.
   // quando o modificador de acesso for protected todas subclasse tem acesso direto aos atributos.
   // caso queira que uma classe que não seja sub classe de Pessoa tenha acesso direto aos atributos, então essa classe precisa estar dentro do mesmo pacote de Pessoa
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+ " "+ this.endereco.getCep());
    }

    static{
        System.out.println("dentro do bloco de inicialização estático de Pessoa");
    }
    {
        System.out.println("dentro do bloco de inicialização não estático de Pessoa");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
