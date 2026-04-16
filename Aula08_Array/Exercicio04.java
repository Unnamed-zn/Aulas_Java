package Aula08;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos números terão no array? ");
        int quantidade = scan.nextInt();
        int[] numeros = new int[quantidade];
        for (int i=0; i<quantidade; i++) {
            System.out.print("Digite o "+(i+1)+"° número: ");
            numeros[i] = scan.nextInt();
        }
        System.out.print("Qual número deseja verificar? ");
        int qual = scan.nextInt();
        boolean encontrou = false;
        for (int numero : numeros) {
            if (numero==qual) {
                encontrou = true;
            }
        }
        System.out.println(encontrou);
    }
}
