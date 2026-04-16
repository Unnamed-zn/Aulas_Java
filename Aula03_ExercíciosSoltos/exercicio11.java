package Aula_3;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um texto: ");
        String texto = scan.nextLine().toLowerCase();
        
        System.out.println(texto.replace("java", "programação"));
        
    }
}