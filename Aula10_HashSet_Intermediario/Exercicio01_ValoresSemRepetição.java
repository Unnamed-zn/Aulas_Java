package Aula10_02;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio01_ValoresSemRepetição {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> numerosHash = new HashSet<>();
        
        System.out.print("Qual será o tamanho da lista? ");
        int[] numerosArray = new int[scan.nextInt()];
        
        for (int i=0; i<numerosArray.length; i++) {
            System.out.print("Digite o "+(i+1)+"° número da lista: ");
            int numero = scan.nextInt();
            
            numerosArray[i] = numero;
            numerosHash.add(numero);
        }
        
        System.out.println("=-=-=-= LISTA DE NÚMEROS =-=-=-=");
        for (int i=0; i<numerosArray.length; i++) {
            System.out.println((i+1)+"° - "+numerosArray[i]);
        }
        
        int contador = 1;
        System.out.println("=-=-=-= VALORES SEM REPETIÇÃO =-=-=-=");
        for (int numero : numerosHash) {
            System.out.println(contador+"° - "+numero);
            contador++;
        }
    }
}