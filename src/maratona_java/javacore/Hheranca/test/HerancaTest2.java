package maratona_java.javacore.Hheranca.test;

import maratona_java.javacore.Hheranca.dominio.Funcionario;

/*

Ordem dos acontecimentos:

0 - o bloco de inicialização estático da super classe é executado quando a JVM carregar a super classe
1 - o bloco de inicialização estático da sub classe é executado quando a JVM carregar a sub classe
2 - alocado espaço em memória para o objeto da super classe
3 - cada atributo da super classe é inicializado - default ou o que for passado da super classe
4 - bloco de inicialização da super classe  é executado na ordem em que aparece
5 - construtor da super classe é executado
6 - alocado espaço em memória para o objeto da sub classe
7 - cada atributo da sub classe é inicializado - default ou o que for passado
8 - bloco de inicialização da sub classe  é executado na ordem em que aparece
9 - construtor da sub classe é executado
 */

public class HerancaTest2 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("leo");
    }
}
