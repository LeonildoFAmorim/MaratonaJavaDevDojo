package maratona_java.javacore.Kenumeracao.dominio;

/* enumeração serve para forçar o usuário a utilizar um determinado valor,
neste caso o atributo tipo está limitado a receber apenas os valores que estão abaixo, da mesma forma
isso evita inconsistencia de dados, porque o tipo poderia ser passado de várias formas se não fosse a enumeração.


 */

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
