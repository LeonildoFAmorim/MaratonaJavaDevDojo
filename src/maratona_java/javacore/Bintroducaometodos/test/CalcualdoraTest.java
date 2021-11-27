package maratona_java.javacore.Bintroducaometodos.test;

import maratona_java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalcualdoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.multiplicaDoisNumeros(40,9);
        System.out.println(calculadora.divideDoisNumeros(40,2));
        calculadora.imprimeDivisaoDeDoisNumeros(12,2);
        calculadora.alteraDoisNumeros(1,3);// ao passar valores do tipo primitivo, a variável original no caso a variável da classe não será alterada, nesse caso os valroes 1 e 3 não serão impressos e sim 12 e 13 da classe
    }
}
