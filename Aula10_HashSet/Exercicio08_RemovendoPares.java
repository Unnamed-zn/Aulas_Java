package Aula10_HashSet;

import java.util.HashSet;

public class Exercicio08_RemovendoPares {

    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        System.out.println(numeros);

        System.out.println("Removendo pares...");

        numeros.removeIf(n -> (n%2==0));
        
        /*for (int numero : numeros) {
            
            if (numero % 2 == 0) {

                numeros.remove(numero);
                        

            }
        }*/

        System.out.println(numeros);
    }
}
