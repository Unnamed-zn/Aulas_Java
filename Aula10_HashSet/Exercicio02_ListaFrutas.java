package Aula10_HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio02_ListaFrutas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> frutas = new HashSet<>();
        
        System.out.println("Adicionando frutas à lista (você pode digitar 'sair' a qualquer momento).");
        
        do {
            System.out.println("Digite uma fruta: ");
            frutas.add(scan.nextLine().toLowerCase());
        } while (!frutas.contains("sair"));
        frutas.remove("sair");
        
        System.out.println("=-=-= Lista de frutas =-=-=");
        for (String fruta : frutas) {
            System.out.println("- "+fruta);
        }
        
        System.out.println("Qual fruta deseja remover? ");
        frutas.remove(scan.nextLine().toLowerCase());
        
        System.out.println("=-=-= Lista de frutas =-=-=");
        for (String fruta : frutas) {
            System.out.println("- "+fruta);
        }
        
        
    }
}
