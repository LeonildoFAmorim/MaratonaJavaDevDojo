package maratona_java.javacore.Bintroducaometodos.dominio;

public class ImpressoraDeEstudante {
    public void imprimeEstudante(Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("--------------------------");
    }
}
