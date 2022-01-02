package loops;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        do{
            System.out.println("Nome: ");
            nome = scanner.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scanner.nextInt();
        }while(nome !="0");
    }
}
