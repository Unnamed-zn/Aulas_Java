package Aula10_02;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio06_DicionariodePalavras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> dicionario = new HashSet<>();
        String palavra;
        do {
            System.out.println("Digite uma palavra: ");
            palavra = scan.nextLine().toLowerCase();
            if (palavra.equals("sair")) break;
            if (dicionario.contains(palavra)) {
                System.out.println("A palavra "+palavra+" já era conhecida.");
            } else if (palavra.equals("sair")) {
                break;
            } else {
                dicionario.add(palavra);
                System.out.println("Acabamos de aprender a palavra "+palavra+".");
            }
        } while (true);
        
        System.out.println("=-=-= PALAVRAS APRENDIDAS =-=-=");
        for (String arg : dicionario) {
            System.out.println("- "+arg);
        }
    }
}
