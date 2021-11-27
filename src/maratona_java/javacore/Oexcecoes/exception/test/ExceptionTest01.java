package maratona_java.javacore.Oexcecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try {
           boolean arquivoCriado = file.createNewFile();
            System.out.println("status do arquivo criado: " + arquivoCriado);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
