package maratona_java.introducao;

public class S05ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] num = new int[3][];
        int [] array = {23,56,787};
        int [][] num2 = {{23,78},{22,67,78,90,34},{12,89},{34,54,78}};
        // essas são as formas de inicializar um array multidimensional
        num[0] = array;
        num[1] = new int[]{12,34,56,2,4,5,6,7};
        num[2] = new int[]{24,7,8};
        System.out.println("primeira matriz");
        for (int [] i: num){
            System.out.println("\n---------");
            for (int j: i){
                System.out.print(j + " ");
            }
        }

        System.out.println("\n segunda matriz");
        for (int [] i: num2){
            System.out.println("\n---------");
            for (int j: i){
                System.out.print(j + " ");
            }
        }
    }
}
