package maratona_java.javacore.Oexcecoes.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("fechando leitor 2");
    }
}
