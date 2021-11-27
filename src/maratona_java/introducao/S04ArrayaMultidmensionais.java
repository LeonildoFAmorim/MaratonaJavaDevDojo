package maratona_java.introducao;

public class S04ArrayaMultidmensionais {
    public static void main(String[] args) {
        int[][] dias = new int[3][2];
        System.out.println("tamanho array:" + dias.length); // o tamanho do array será sempre o tamanho da base, nesse caso 3
        dias[0][0] = 12;
        dias[0][1] = 24;
        dias[1][0] = 36;
        dias[1][1] = 48;
        dias[2][0] = 60;
        dias[2][1] = 72;

        System.out.println("foreach");
        for (int [] arrayBase: dias){
            for (int num : arrayBase){
                System.out.println(num);
            }
        }
        System.out.println("for convencional");
        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
    }
}
