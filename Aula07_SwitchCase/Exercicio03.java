package Aula07;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine().toLowerCase();
        
        for (int i=0; i<palavra.length(); i++) {
            switch (palavra.charAt(i)) {
                case 'a' -> System.out.println("A letra "+palavra.charAt(i)+" é vogal");
                case 'e' -> System.out.println("A letra "+palavra.charAt(i)+" é vogal");
                case 'i' -> System.out.println("A letra "+palavra.charAt(i)+" é vogal");
                case 'o' -> System.out.println("A letra "+palavra.charAt(i)+" é vogal");
                case 'u' -> System.out.println("A letra "+palavra.charAt(i)+" é vogal");
                default -> System.out.println("A letra "+palavra.charAt(i)+" não é vogal");
            }
        }
    }
}
