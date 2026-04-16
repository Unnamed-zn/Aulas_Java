package Aula08;

import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] numeros = new int[10];
        for (int i=0; i<10; i++) {
            numeros[i] = rd.nextInt(100)+1;
        }
        int[] numerosDobrados = new int[10];
        for (int i=0; i<10; i++) {
            numerosDobrados[i] = numeros[i]*2;
        }
        for (int numero : numeros) {
            System.out.print(numero+" ");
        }
        System.out.println("");
        for (int numero : numerosDobrados) {
            System.out.print(numero+" ");
        }
    }
}
