package maratona_java.javacore.Kenumeracao.test;

import maratona_java.javacore.Kenumeracao.dominio.Cliente;
import maratona_java.javacore.Kenumeracao.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        // obrigatoriamente na criação do objeto é passado apenas as enumerações definidas na classe TipoCliente, não pode ser
        // não poderá ser passado nada diferente, isso evita a inconsistencia de dados
        Cliente cliente = new Cliente("leo", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("ma", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("ma", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("ma", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
