/*

gerar um programa que calcule quantas vezes um carro pode ser divido, as parcelas precisam ser no mínimo de 1000 reais
 */

package maratona_java.introducao;

public class S01EstruturaDeRepetica_Break {
    public static void main(String[] args) {
        int valorDoCarro = 30000;
        int execucoes = 0;
        for (int valorParcela = 1; valorParcela <= valorDoCarro; valorParcela++) {
            if (valorDoCarro / valorParcela < 1000) {
                break;// comentar esta linha para ver o resultado
            }
            System.out.println(valorParcela + " vezes de : " + valorDoCarro / valorParcela);
            execucoes++;
        }
        System.out.println("execuções: " + execucoes);
    }
}
