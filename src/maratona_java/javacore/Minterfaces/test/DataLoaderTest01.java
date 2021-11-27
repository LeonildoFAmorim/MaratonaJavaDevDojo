package maratona_java.javacore.Minterfaces.test;

import maratona_java.javacore.Minterfaces.dominio.DataBaseLoader;
import maratona_java.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.loader();
        fileLoader.loader();
        dataBaseLoader.remover();
        fileLoader.remover();
        dataBaseLoader.checarPermissao();
        fileLoader.checarPermissao();
    }
}
