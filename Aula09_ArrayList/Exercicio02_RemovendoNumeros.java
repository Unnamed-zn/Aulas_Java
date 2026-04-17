package Aula09_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02_RemovendoNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.print("Quantos numeros adicionará à lista? ");
        int quantidadeNumeros = scan.nextInt();
        
        for (int i=0; i<quantidadeNumeros; i++) {
            System.out.print("Digite o "+(i+1)+"° número: ");
            numeros.add(scan.nextInt());
        }
        for (int numero : numeros) {
            System.out.println("- "+numero+";");
        }
        
        System.out.print("Qual item deseja remover da lista? ");
        int qual = scan.nextInt();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == qual) {
                numeros.remove(i);
            }
        }
        
        for (int numero : numeros) {
            System.out.println("- "+numero+";");
        }
        System.out.print("Tamanho atual da lista: "+numeros.size());
        System.out.println();
    }
}
