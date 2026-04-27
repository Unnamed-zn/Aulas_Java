package Aula10_02;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio08_Exclusividade {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
        HashSet<String> listaA = new HashSet<>();
        HashSet<String> listaB = new HashSet<>();
        
        int tamanho;
        while (true) {
            System.out.print("Quantos itens deseja adicionar à primeira lista? ");
            if (scanInt.hasNextInt()) {
                tamanho = scanInt.nextInt();
                System.out.println();
                break;
            } else {
                System.out.println("Entrada inválida, tente novamente.");
                scanInt.next();
                System.out.println();
            }
        }
        for (int i=1; i<=tamanho; i++) {
            System.out.print("Digite o "+i+"° item da lista: ");
            listaA.add(scanString.nextLine());
        }
        System.out.println("");
        while (true) {
            System.out.print("Quantos itens deseja adicionar à primeira lista? ");
            if (scanInt.hasNextInt()) {
                tamanho = scanInt.nextInt();
                System.out.println();
                break;
            } else {
                System.out.println("Entrada inválida, tente novamente.");
                scanInt.next();
                System.out.println();
            }
        }
        for (int i=1;i<=tamanho; i++) {
            System.out.print("Digite o "+i+"° item da lista: ");
            listaB.add(scanString.nextLine());
        }
        
        System.out.println("=-=-=-= EXCLUSIVOS DA PRIMEIRA LISTA =-=-=-=");
        for (String palavra : listaA) {
            if (!listaB.contains(palavra)) {
                System.out.println("- "+palavra);
            }
        }
    }
}
