package maratona_java.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void loader() {
        System.out.println("carregando arquivos do banco de dados");
    }

    @Override
    public void remover() {
        System.out.println("removendo arquivos do banco de dados");
    }

    @Override
    public void checarPermissao() {
        System.out.println("checando permissão dentro do arquivo");
    }
}
