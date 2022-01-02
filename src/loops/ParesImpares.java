package loops;

import java.util.Arrays;
import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0, impares =0 , quantidade = 0;
        System.out.println("Quantos números???: ");
        quantidade = scanner.nextInt();

        int[] numeros = new int[quantidade];

        for(int i=0;i<numeros.length;i++) {
            System.out.println("Número: ");
            numeros[i] = scanner.nextInt();

            if(numeros[i]%2==0) pares++;
            else impares++;
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println(Arrays.toString(numeros));
    }
}
