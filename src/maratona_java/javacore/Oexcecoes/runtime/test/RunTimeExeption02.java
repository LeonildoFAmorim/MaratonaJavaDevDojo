package maratona_java.javacore.Oexcecoes.runtime.test;

public class RunTimeExeption02 {
    public static void main(String[] args) {
        System.out.println(divisao(2,0));
    }

    public static int divisao(int a, int b){
      if (b == 0){
          throw new IllegalArgumentException("argumento ilegal, não pode ser zero");
      }
        return a/b;
    }
}
