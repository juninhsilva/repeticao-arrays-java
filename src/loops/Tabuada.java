package loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o número???:");
        int numero = scanner.nextInt();
        System.out.println("Tabuada de " + numero +":");
        for(int i=0; i<=10;i++){
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
