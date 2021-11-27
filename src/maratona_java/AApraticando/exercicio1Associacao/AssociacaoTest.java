package maratona_java.AApraticando.exercicio1Associacao;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("leo", 40);
        Aluno aluno2 = new Aluno("marinalva", 47);
        Aluno aluno3 = new Aluno("giovana", 13);
        Aluno aluno4 = new Aluno("gabriel", 05);
        Aluno[] alunosSeminario = {aluno1,aluno2,aluno3,aluno4};
        Aluno[] alunosSeminario1 = {aluno3};
        Local local = new Local("jardim novo horizonte");

        Seminario seminarioVazio = new Seminario("testando para praticar",alunosSeminario1,local);
        Seminario seminario1 = new Seminario("aprendendo veterinaria",alunosSeminario, local);
        Seminario [] seminarios = {seminarioVazio,seminario1};

        Professor professor = new Professor(" dieck chan", "professor das galaxias",seminarios);
        professor.imprime();
    }
}
