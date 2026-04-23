package Aula10_HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio06_RemovendoSaoPaulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> cidades = new HashSet<>();
        
        System.out.println("Adicionando cidades à lista (você pode digitar 'sair' a qualquer momento).");
        
        do {
            System.out.println("Digite uma cidade: ");
            cidades.add(scan.nextLine().toLowerCase());
        } while (!cidades.contains("sair"));
        cidades.remove("sair");
        
        cidades.remove("são paulo");
        cidades.remove("sao paulo");
        cidades.remove("saopaulo");
        cidades.remove("sãopaulo");
        System.out.println("=-=-= Lista de cidades =-=-=");
        for (String cidade : cidades) {
            System.out.println("- "+cidade);
        }
        
    }
}
