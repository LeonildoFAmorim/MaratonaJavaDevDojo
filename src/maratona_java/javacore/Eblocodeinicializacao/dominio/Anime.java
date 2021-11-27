package maratona_java.javacore.Eblocodeinicializacao.dominio;

/*
nesse caso temos dois construtores, um que recebe nome e outro que não recebe nada, indenpedente de qual
construtro for utilziado na classe principal, o código imprimirá um array de 1 a 100 porque esta impressão
está sendo feita dentro de um bloco de incialização.

ordem dos acontecimentos:

1 - alocado espaço em memória para o objeto
2 - cada atributo da classe é inicializado - default ou o que for passado
3 - bloco de inicialização é executado
4 - construtor é executado

OBS.: em herança esse acontecimento é um pouco diferente. (Ver pacote Hheranca).
 */

public class Anime {
    private String nome;
    private int[] episodios;

    public Anime(){
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // bloco de inicialização pode ser escrito em qualquer parte do código ele será o primeiro a ser executado indenpente se tiver um ou mais construtores
    // indenpendente do construtor a ser utilziado, esse bloco de código será executado
    // isso evita a repetição de código, no caso esse bloco de código teria que ser feito dentro dos dois construtores acima
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}

