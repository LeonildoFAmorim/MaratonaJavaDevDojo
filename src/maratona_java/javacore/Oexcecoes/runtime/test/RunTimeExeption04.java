package maratona_java.javacore.Oexcecoes.runtime.test;

public class RunTimeExeption04 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e) {
            System.out.println("dentro o IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("dentro do ArithmeticException");
        }catch (RuntimeException e){ // o tipo mais genérico é sempre o útlimo catch
            System.out.println("dendro da RuntimeException");
        }
    }
}
