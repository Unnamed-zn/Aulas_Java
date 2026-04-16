package Aula08;

import java.util.Scanner;
        
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos números terão no primeiro array? ");
        int quantidade = scan.nextInt();
        int[] numeros1 = new int[quantidade];
        for (int i=0; i<quantidade; i++) {
            System.out.print("Digite o "+(i+1)+"° número: ");
            numeros1[i] = scan.nextInt();
        }
        System.out.print("Quantos números terão no segundo array? ");
        quantidade = scan.nextInt();
        int[] numeros2 = new int[quantidade];
        for (int i=0; i<quantidade; i++) {
            System.out.print("Digite o "+(i+1)+"° número: ");
            numeros2[i] = scan.nextInt();
        }
        int[] numeros3 = new int[Math.max(numeros1.length, numeros2.length)];
        for (int i=0; i<numeros3.length; i++) {
            int valorA=(i<numeros1.length) ? numeros1[i] : 0;
            int valorB=(i<numeros2.length) ? numeros2[i] : 0;
            numeros3[i] = valorA+valorB;
            System.out.print(numeros3[i]+" ");
        }
        System.out.println();
    }
}
