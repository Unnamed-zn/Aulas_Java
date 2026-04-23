package Aula10_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Exercicio09_ListaPaises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> paises = new HashSet<>();
        
        System.out.println("Adicionando paises à lista (você pode digitar 'sair' a qualquer momento).");
        
        do {
            System.out.println("Digite uma país: ");
            paises.add(scan.nextLine().toLowerCase());
        } while (!paises.contains("sair"));
        paises.remove("sair");
        
        System.out.println("=-=-= Lista de paises =-=-=");
        for (String pais : paises) {
            System.out.println("- "+pais);
        }
        
        String[] maiores = {"brasil", "rússia", "china", "estados unidos", "canadá"};
        
        System.out.println("Contém os 5 maiores paises do mundo? "+paises.containsAll(Arrays.asList(maiores)));
        
        
    }
}
