package maratona_java.javacore.Oexcecoes.runtime.test;

public class RunTimeExeption03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("fechando recurso liberado pelo o sistema operacional");
        }
        return null;
    }
}
