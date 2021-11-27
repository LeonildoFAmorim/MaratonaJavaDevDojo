package maratona_java.javacore.Npolimorfismo.test;

/*
neste pacote Npolimorfismo, estamos seguindo o padrão MVC:

pacote dominio = camada de modelo;
pacote servico = camada de serviço - regras de negócio;
pacote test = camada de visualização.

 */

import maratona_java.javacore.Npolimorfismo.dominio.Computador;
import maratona_java.javacore.Npolimorfismo.dominio.Televisao;
import maratona_java.javacore.Npolimorfismo.dominio.Tomate;
import maratona_java.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("computador da galáxia",1500);
        Tomate tomate = new Tomate("tomate vervelho",10);
        Televisao televisao = new Televisao("sansung 50\"",2000);// a barra invertida para imprimir " como parte da String

        CalculadoraImposto.calculaImposto(computador);
        CalculadoraImposto.calculaImposto(tomate);
        CalculadoraImposto.calculaImposto(televisao);
    }
}
