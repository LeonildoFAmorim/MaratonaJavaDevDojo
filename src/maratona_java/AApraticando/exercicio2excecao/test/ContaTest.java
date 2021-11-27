package maratona_java.AApraticando.exercicio2excecao.test;

import maratona_java.AApraticando.exercicio2excecao.dominio.Conta;
import maratona_java.AApraticando.exercicio2excecao.dominio.ExcecaoDeNegocio;

import java.util.Scanner;

public class ContaTest {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite os dados da conta");
        System.out.printf("numero: ");
        String numero = teclado.nextLine();
        System.out.printf("titular: ");
        String titular = teclado.nextLine();
        System.out.printf("balanço: ");
        double balanco = teclado.nextDouble();
        System.out.printf("limite de saque: ");
        double limiteSaque = teclado.nextDouble();

        Conta conta = new Conta(numero,titular,balanco,limiteSaque);

        System.out.print("informe a quantia a sacar: ");
        double saque = teclado.nextDouble();
        try {
            conta.sacar(saque);
            System.out.printf("novo saldo : %.2f%n ", conta.getBalanco());
        }catch (ExcecaoDeNegocio e){
            System.out.println(e.getMessage());
        }

        System.out.printf("quantia para depósito: ");
        double deposito = teclado.nextDouble();
        conta.deposita(deposito);
        System.out.printf("novo saldo: %.2f%n ", conta.getBalanco());
        teclado.close();
    }
}
