package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        String[] vetor =  new String[6];
        Scanner scanner = new Scanner(System.in);
        int consoante = 0;
        for(int i = 0; i < vetor.length;i++){
            String letra = scanner.next();

            if(
                !(
                letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")
                )
            ){
                consoante++;
                vetor[i] = letra;
            }
        }

        System.out.println("Consoantes: " + consoante);
        for (String v: vetor) {
            if (v !=null) {
                System.out.print(v + " ");
            }
        }
    }
}
