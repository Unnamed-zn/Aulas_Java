package Aula08;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos números irá verificar? ");
        int quantidade = scan.nextInt();
        int[] numeros = new int[quantidade];
        for (int i=0; i<quantidade; i++) {
            System.out.print("Digite o "+(i+1)+"° número: ");
            numeros[i] = scan.nextInt();
        }
        for (int i=0; i<quantidade; i++) {
            numeros[i] = Math.max(numeros[i], 0);
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
    }
}