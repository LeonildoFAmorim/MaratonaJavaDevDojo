package maratona_java.javacore.Aintroducaoclasses.test;

import maratona_java.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Leonildo";
        estudante.idade = 40;
        estudante.sexo = 'm';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        // aqui será impresso o endereço de memória,que é do tipo referência
        System.out.println(estudante);
    }
}
