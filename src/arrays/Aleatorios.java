package arrays;

import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];

        for(int i =0; i < numeros.length; i++){
            int numero = random.nextInt();
            numeros[i] = numero;
        }

        System.out.println("Antecessores");

        for(int n: numeros){
            System.out.print((n-1) + " ");
        }

        System.out.println("\nOriginal");

        for(int n: numeros){
            System.out.print(n + " ");
        }

        System.out.println("\nSucessores");

        for(int n: numeros){
            System.out.print((n+1) + " ");
        }
    }
}
