package Aula_3;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine();
        
        String invertida = new StringBuilder(palavra).reverse().toString();
        
        System.out.println(invertida);
        
    }
}