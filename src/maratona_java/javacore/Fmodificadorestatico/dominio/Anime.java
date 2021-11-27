package maratona_java.javacore.Fmodificadorestatico.dominio;

/*
ordem dos acontecimentos:
0 - blco de inicialização é executado quando a JVM carregar a classe
1 - criado espaço em memória para o objeto
2 - cada atributo da classe é inicializado - default ou o que for passado
3 - bloco de inicializaçã é executado
4 - construtor é executado

OBS.: bloco de inicialização é pouco usado, o que é mais usado são métodos estáticos.
 */

public class Anime {
    private String nome;
    private static int[] episodios;

    public Anime(){
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    static { // o bloco de inicialização estático será executado apenas uma vez, indenpedente da quantidade de objetos. Isso evita o desperdício de processamento, porque nesse caso ele está imprimindo um array de 100 posições, como tem 3 objetos criados, seria imprimido 3 vezes a mesma coisa.
        System.out.println("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}

