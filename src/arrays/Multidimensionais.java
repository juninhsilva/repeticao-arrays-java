package arrays;

import java.util.Random;

public class Multidimensionais {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[3][3];

        for(int i =0; i < matriz.length; i++)
            for(int j=0;j<matriz.length;j++)
                matriz[i][j] = random.nextInt(9);

        for(int i =0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz.length; j++)
                System.out.print(matriz[i][j] + " ");
        }
    }
}
