package maratona_java.javacore.Qstring;

public class StringTest2 {
    public static void main(String[] args) {
        String nome = "     luffy      "             ;
        String numeros = "123456";
        System.out.println(nome);
        System.out.println(nome.length());
        System.out.println(nome.charAt(3)); // retorna o caracter na posição 3
        System.out.println(nome.replace("f","l"));// perorre a string e troca a letra f por l
        System.out.println(nome.toLowerCase());// transforma a String em minúsculo
        System.out.println(nome.toUpperCase());// transforma a String em maiúsculo
        System.out.println(numeros.substring(2));// imprime a string a partir da posição 2
        System.out.println(nome.trim()); // remove os valores (espaço em branco) em branco no início e no fim da string, útil para validar login

    }
}
