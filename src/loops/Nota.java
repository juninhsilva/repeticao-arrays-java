package loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        do{
            System.out.println("Nota: ");
            nota = scanner.nextInt();
            if(nota < 0 || nota > 10) System.out.println("Nota inválida. Digite novamente....");
        }while (nota < 0 || nota > 10);
    }
}
