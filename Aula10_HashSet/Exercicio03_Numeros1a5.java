package Aula10_HashSet;

import java.util.HashSet;

public class Exercicio03_Numeros1a5 {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }
        
        System.out.println("Lista de números: "+numeros);
        
        numeros.clear();
        
        System.out.println("Lista de números: "+numeros);
    }
}
