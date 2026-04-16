package Aula08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos números irá adicionar à lista? ");
        int quantos = scan.nextInt();
        int[] numeros = new int[quantos];
        for (int i=0; i<quantos; i++) {
            System.out.print("Digite o "+(i+1)+"° número: ");
            numeros[i] = scan.nextInt();
        }
        System.out.print("Qual número deseja checar a frequência? ");
        int qual = scan.nextInt();
        int frequencia=0;
        for (int teste : numeros) {
            if (teste==qual) {
                frequencia++;
            }
        }
        System.out.println("O número "+qual+" aparece "+frequencia+" vezes na lista.");
    }
}
