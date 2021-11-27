package maratona_java.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{// uma classe pode implementar várias interfaces

    @Override
    public void loader() {
        System.out.println("carregando dados do banco de dados");
    }

    @Override
    public void remover() {
        System.out.println("removendo dados do banco de dados");
    }

    @Override
    public void checarPermissao() {
        System.out.println("checando permissao dentro do banco de dados");
    }
}
