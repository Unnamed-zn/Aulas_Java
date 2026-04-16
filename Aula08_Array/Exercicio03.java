package Aula08;

import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {
        Random rd = new Random();
        int maior=Integer.MIN_VALUE;
        int numeros[] = new int[10];
        for (int i=0; i<=9; i++) {
            numeros[i] = rd.nextInt(10)+1;
        }
        for (int i=0; i<=9; i++) {
            maior=Math.max(maior, numeros[i]);
        }
        System.out.print("Os números gerados foram ");
        for (int numero : numeros) {
            System.out.print(numero+" ");
        }
        System.out.println("");
        System.out.println("O maior número gerado foi "+maior);
    }
}
