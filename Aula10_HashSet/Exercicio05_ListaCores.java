package Aula10_HashSet;

import java.util.HashSet;
import java.util.Scanner;



public class Exercicio05_ListaCores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> cores = new HashSet<>();
        
        System.out.println("Adicionando cores à lista (você pode digitar 'sair' a qualquer momento).");
        
        do {
            System.out.println("Digite uma cor: ");
            cores.add(scan.nextLine().toLowerCase());
        } while (!cores.contains("sair"));
        cores.remove("sair");
        
        System.out.println("=-=-= Lista de cores =-=-=");
        for (String cor : cores) {
            System.out.println("- "+cor);
        }
    }
}
