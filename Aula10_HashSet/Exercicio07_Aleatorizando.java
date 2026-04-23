package Aula10_HashSet;

import java.util.HashSet;
import java.util.Random;

public class Exercicio07_Aleatorizando {
    public static void main(String[] args) {
        Random rd = new Random();
        HashSet<Integer> numeros = new HashSet<>();
        
        int Quantos = rd.nextInt(10)+1;
        for (int i = 1; i <= Quantos; i++) {
            numeros.add(rd.nextInt(10)+1);
        }
        
        System.out.println("=-=-= Lista de Números =-=-=");
        for (int numero : numeros) {
            System.out.println("- "+numero);
        }
        
        System.out.println("A lista tem "+numeros.size()+" números.");
    }
}
