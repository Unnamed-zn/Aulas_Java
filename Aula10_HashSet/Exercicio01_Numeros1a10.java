package Aula10_HashSet;

import java.util.HashSet;

public class Exercicio01_Numeros1a10 {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        System.out.println(numeros);
        
        System.out.println("A lista contém o número 5? "+numeros.contains(5));
    }
}