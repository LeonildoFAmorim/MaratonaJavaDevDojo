package maratona_java.javacore.Kenumeracao.test;

import maratona_java.javacore.Kenumeracao.dominio.Clientes;
import maratona_java.javacore.Kenumeracao.dominio.TipoClientes;
import maratona_java.javacore.Kenumeracao.dominio.TipoPagamento;

public class ClienteTest2 {
    public static void main(String[] args) {
        Clientes clientes = new Clientes("leo", TipoClientes.PESSOA_FISICA);
        Clientes clientes1 = new Clientes("ma", TipoClientes.PESSOA_JURIDICA);

        System.out.println(clientes);
        System.out.println(clientes1);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

        // buscando os valores da enumeração com base no tipo do cliente.
        TipoClientes clientes3 = TipoClientes.retornaValorDaEnumeracaoPorTipoPessoa("pessoa jurídicacc");
        System.out.println(clientes3);

    }
}
