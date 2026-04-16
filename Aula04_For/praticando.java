package Aula04;

import java.util.Scanner;

public class praticando {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine().toLowerCase();
        
        String vogais = "aeiouãõáéíóúâêîôû";
        
        int contador = 0;
        
        for (int i=0; i<(palavra.length()); i++) {
            char letra=palavra.charAt(i);
            
            if (vogais.contains(String.valueOf(letra))) {
                contador++;
            }
            
        }
        
        System.out.println("Número de vogais: "+contador);
        
    }
}