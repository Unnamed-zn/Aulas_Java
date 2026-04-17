package Aula09_ArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Exercicio03_FiltrarPares {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();
        
        for (int i=1; i<=10; i++) {
            numeros.add(rd.nextInt(20)+1);
        }
        
        for (int i=0; i<numeros.size(); i++) {
            if (numeros.get(i)%2==0) {
                numerosPares.add(numeros.get(i));
            }
        }
        
        System.out.println("Numeros Gerados: ");
        for (int numero:numeros) {
            System.out.println("- "+numero);
        }
        System.out.println("Numeros Pares: ");
        for (int numeroPar:numerosPares) {
            System.out.println("- "+numeroPar);
        }
    }
}
