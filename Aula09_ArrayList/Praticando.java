package Aula09_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Praticando {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rd = new Random();
        
        
        for (int i=1; i<=10; i++) {
            numeros.add(rd.nextInt(10)+1);
        }
        
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        Collections.sort(numeros);
        
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        Collections.reverse(numeros);
        
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
