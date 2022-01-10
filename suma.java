public class suma {
    public static void main(String[] args) {
        int[][] matriz = {{8, 3, 5}, {2, 5, 4}, {9, 10, 2}};
        int total=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
                total += matriz[i][j] ;
            }
            System.out.println("\n");
        }

        System.out.print(total);
    }
}
