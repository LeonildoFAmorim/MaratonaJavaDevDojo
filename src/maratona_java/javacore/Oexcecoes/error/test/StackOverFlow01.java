package maratona_java.javacore.Oexcecoes.error.test;

public class StackOverFlow01 {
    public static void main(String[] args) {
        recursividade();

    }

    public static void recursividade() {
        recursividade();
    }
}

