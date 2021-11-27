package maratona_java.javacore.Oexcecoes.exception.test;

import maratona_java.javacore.Oexcecoes.exception.dominio.Leitor1;
import maratona_java.javacore.Oexcecoes.exception.dominio.Leitor2;

import java.io.IOException;

// try com recursos é muito útil porque não precisa se preocupar com abrir e fechar arquivo, o java fecha tudo.
public class TryComRecursosTest01 {
    public static void main(String[] args) {
        lerArquivo();// leitor1 e leitor2 são fechados inverso na ordem em que foram criados
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {// o java já se encarrega de fechar o arquivo

        } catch (IOException e) {

        }
    }
}
