package Aula10_HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio04_ListaCidades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> cidades = new HashSet<>();
        
        System.out.println("Adicionando cidades à lista (você pode digitar 'sair' a qualquer momento).");
        
        do {
            System.out.println("Digite uma cidade: ");
            cidades.add(scan.nextLine().toLowerCase());
        } while (!cidades.contains("sair"));
        cidades.remove("sair");
        
        System.out.println("=-=-= Lista de cidades =-=-=");
        for (String cidade : cidades) {
            System.out.println("- "+cidade);
        }
        
        System.out.println("A lista está vazia? "+cidades.isEmpty());
        
    }
}
