package maratona_java.javacore.Kenumeracao.dominio;

public class Clientes {
    private String nome;
    private TipoClientes tipoClientes;

    public Clientes(String nome, TipoClientes tipoClientes) {
        this.nome = nome;
        this.tipoClientes = tipoClientes;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nome ='" + nome + '\'' +
                ", tipoClientesInt = " + tipoClientes.getValor() + tipoClientes.getTipoPessoa() +
                '}';
    }
}
