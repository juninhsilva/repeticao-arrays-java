package loops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0;
        double media = 0;
        int[] numeros = new int[5];
        for(int i=0;i<numeros.length;i++){
            System.out.println("Número: ");
            numeros[i] = scanner.nextInt();
            media += numeros[i];
        }

        media/=numeros.length;
        maior = numeros[0];

        for(int i=1;i< numeros.length;i++){
            if(numeros[i]>maior){
                maior=numeros[i];
            }
        }

        System.out.println("Media: " + media);
        System.out.println("Maior: " + maior);
    }
}
