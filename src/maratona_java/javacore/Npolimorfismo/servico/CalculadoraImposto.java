package maratona_java.javacore.Npolimorfismo.servico;

/*
na arquitetura MVC, separamos o modelo (dominio) da regra de negócio (controller).
 MVC = separar a regra de negócio do domínio (que é representado pelo o banco de dados) com o que vai ser visualizado, que nesse caso é o test
 */

import maratona_java.javacore.Npolimorfismo.dominio.Produto;
import maratona_java.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    /*   quando o método não está acessando nenhum atributo de classe, ele pode ser estático.
    isso facilitará no momento de exibir o resultado lá na classe principal, porque não precisa criar um objeto para exibir os resultados,
    basta chamar cada método abaixo utilizando a própria classe CalculadoraImposto, se esses métodos abaixo não fossem estáticos, seria necessário
    criar um objeto CalculadoraImposto.
 */

    public static void calculaImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) { // se a instancia de produto for um tomate
            Tomate tomate = (Tomate) produto; // para imprimir a data de validade que só tem no tomate fazemos o casting
            System.out.println("data de validade: " + tomate.getDataValidade());
        }
        System.out.println("-----------------------------");
    }
}
