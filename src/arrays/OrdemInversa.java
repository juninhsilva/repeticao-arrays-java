package arrays;

import java.util.Arrays;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6};
        int[] numeros = new int[6];

        System.out.println(Arrays.toString(vetor));
        int count = 0;
        while(count < vetor.length){
            numeros[vetor.length-1-count] = vetor[count];
            count++;
        }
        System.out.println(Arrays.toString(numeros));
    }
}
