package maratona_java.javacore.Bintroducaometodos.test;

import maratona_java.javacore.Bintroducaometodos.dominio.Estudante;
import maratona_java.javacore.Bintroducaometodos.dominio.ImpressoraDeEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        Estudante estudante3 = new Estudante();
        Estudante estudante4 = new Estudante();
        Estudante estudante5 = new Estudante();
        ImpressoraDeEstudante impressora = new ImpressoraDeEstudante();

        estudante1.nome = "leonildo";
        estudante1.idade = 40;
        estudante1.sexo = 'm';

        estudante2.nome = "marinalva";
        estudante2.idade = 45;
        estudante2.sexo = 'f';

        estudante3.nome = "giovana";
        estudante3.idade = 13;
        estudante3.sexo = 'f';

        estudante4.nome = "gabriel";
        estudante4.idade = 5;
        estudante4.sexo = 'm';

        estudante5.nome = "liza";
        estudante5.idade = 10;
        estudante5.sexo = 'f';

        impressora.imprimeEstudante(estudante1); // aqui está sendo passado um objeto como parâmetro, ou seja está sendo passado a referência de onde o objeto está guardado
        impressora.imprimeEstudante(estudante2);
        impressora.imprimeEstudante(estudante3);
        impressora.imprimeEstudante(estudante4);
        impressora.imprimeEstudante(estudante5);
    }
}
