package maratona_java.AApraticando.exercicio1Associacao;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("professor: " + this.nome + " especialidade: "+ this.especialidade);
        if (seminarios == null) return;
        System.out.println("seminarios: ");
        for (Seminario seminario : seminarios) {
            System.out.println("titulo do semininario: "+ seminario.getTitulo());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("alunos: ");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("nome: " + aluno.getNome()+ " idade: " + aluno.getIdade());
            }
            System.out.println("local: " + seminario.getLocal().getEndereco());
            System.out.println("-------------------------------------------");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
