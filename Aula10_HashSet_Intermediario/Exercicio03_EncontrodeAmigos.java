package Aula10_02;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio03_EncontrodeAmigos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> listaA = new HashSet<>();
        HashSet<String> listaB = new HashSet<>();
        
        System.out.println("=== CRIANDO GRUPO A");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o "+i+"° nome: ");
            listaA.add(scan.nextLine());
        }
        System.out.println("=== CRIANDO GRUPO B");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o "+i+"° nome: ");
            listaB.add(scan.nextLine());
        }
        
        HashSet<String> intersecao = new HashSet<>(listaA);
        intersecao.retainAll(listaB);
        
        System.out.println("Pertencem aos dois grupos apenas: "+intersecao);
    }
}
