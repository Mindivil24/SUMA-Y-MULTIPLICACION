public class Multiplicación {
    public static void main(String[] args) {
        int[][] matriz = {{10, 11, 12}, {11, 12, 13}, {12, 13, 14}};
        int total=1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
                total *= matriz[i][j] ;
            }
            System.out.println("\n");
        }

        System.out.print(total);
    }
}
