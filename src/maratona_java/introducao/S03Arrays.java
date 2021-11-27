package maratona_java.introducao;

public class S03Arrays {
    public static void main(String[] args) {
        int [] numeros = new int[5]; // uma maneira de inicializar um array
        int [] numeros1 = {12,34,56,1}; // outra maneira de inicializar um array
        int [] numeros2 = new int[]{23,54,89}; // mais uma foram de inicializar um array
        System.out.println(numeros.length);
        System.out.println(numeros1.length);
        System.out.println(numeros2.length);
        // foreach, próprios dos arrays
        System.out.println("imprimindo um vetor usando foreach");
        for (int i : numeros1){
            System.out.println(i);
        }
    }
}
