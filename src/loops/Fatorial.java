package loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o número???:");
        int fatorial = scanner.nextInt();
        int contador = fatorial;
        System.out.println("Fatorial de " + fatorial +":");

        do{
            fatorial*=contador-1;
            contador--;
        }while(contador > 1);
        System.out.println(fatorial);

    }
}
