package maratona_java.javacore.Npolimorfismo.test;

import maratona_java.javacore.Npolimorfismo.dominio.Computador;
import maratona_java.javacore.Npolimorfismo.dominio.Produto;
import maratona_java.javacore.Npolimorfismo.dominio.Tomate;
import maratona_java.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("multilaser",2000);

        Tomate tomate = new Tomate("tomate amarelo",10);
        
        tomate.setDataValidade("27/11/2011");
        CalculadoraImposto.calculaImposto(tomate);
        CalculadoraImposto.calculaImposto(produto);

    }
}
