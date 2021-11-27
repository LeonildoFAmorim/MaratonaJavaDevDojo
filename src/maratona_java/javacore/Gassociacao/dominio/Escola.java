package maratona_java.javacore.Gassociacao.dominio;
/*
associação unidirecional = um para muitos, nesse caso um professor pode fazer parte de uma só escola mas uma escola pode ter vários professores.
 */

public class Escola {
    private String nome;
    private Professor [] professores;

    public Escola(String nome) {
        this.nome = nome;
    }
    // essa sobrecarga de construtor é importante porque se já tiver o professor disponível, ele já pode ser passado
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
