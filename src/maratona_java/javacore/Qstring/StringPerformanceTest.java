package maratona_java.javacore.Qstring;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();// tempo atual do sistema operacional
        concatenaString(100_000); // 10.000 pode ser escrito assim no java separa do por underline
        long fim = System.currentTimeMillis();
        System.out.println("tempo gasto para String: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();// tempo atual do sistema operacional
        concatenaStringBuilder(100_000); // 10.000 pode ser escrito assim no java separa do por underline
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para String builder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();// tempo atual do sistema operacional
        concatenaStringBuffer(100_000); // 10.000 pode ser escrito assim no java separa do por underline
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para String builder: " + (fim - inicio) + "ms");
    }
    private  static void concatenaString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++){
            texto += 1;
        }
    }

    private  static void concatenaStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++){
            sb.append(1);
        }
    }

    private  static void concatenaStringBuffer (int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++){
            sb.append(1);
        }
    }
}
