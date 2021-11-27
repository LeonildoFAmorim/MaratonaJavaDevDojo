package maratona_java.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0; // não precisa do else porque a linha 16 não será executada caso o num2 seja zero porque o return já foi executado(método finalizado))
        }
        return num1/num2;
    }

    public void imprimeDivisaoDeDoisNumeros(int num1, int num2){
        if(num2 ==0){
            System.out.println("não existe divisão por zero");
            return; // o return em métodos void funciona como um break, finaliza o código
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 12;
        num2 = 13;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }

    public void somaArray(int [] numeros){
        int soma = 0;
        for (int i:numeros){
            soma += i;
        }
        System.out.println(soma);
    }

    // varargs é uma forma mais simples de manipular arrays
    public void somaVarargs(int...numeros){//se tiver mais de um atributo como argumento, o varargs tem que ser o último
        int soma = 0;
        for (int i:numeros){
            soma += i;
        }
        System.out.println(soma);
    }
}
