package Aula_3;

import java.util.Scanner;


public class exercicio6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        
        System.out.println("O nome "+nome+" possuí um total de "+nome.replace(" ","").length()+" caracteres.");
        
    }
}