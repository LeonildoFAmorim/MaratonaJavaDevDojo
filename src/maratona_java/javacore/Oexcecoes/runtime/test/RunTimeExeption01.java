package maratona_java.javacore.Oexcecoes.runtime.test;

public class RunTimeExeption01 {
    public static void main(String[] args) {
        // checked e unchecked : estes são os tipos de execessão
        // checked = são diretamente filhas da classe exception, quando não tratadas irão lançar um erro em tempo de compilação.
        // uncheckd = na maiorias das vezes são lançadas por causa das tratativas não feitas pelo o programador, ex.: formatar uma String ao invés de um inteiro.
        int[]arr = {12,34};
        System.out.println(arr[2]);
    }
}
