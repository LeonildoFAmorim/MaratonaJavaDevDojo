package maratona_java.javacore.Bintroducaometodos.test;

import maratona_java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaArray(new int[]{1,2,3,4,5});
        calculadora.somaVarargs(1,2,3,4,5); // é mais simples a passagem do valores
    }
}
