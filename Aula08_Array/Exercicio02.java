package Aula08;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine();
        char[] letras = new char[frase.length()];
        for (int i=0; i<frase.length(); i++) {
            letras[frase.length()-i-1] = frase.charAt(i);
        }
        for (char letra : letras) {
            System.out.print(letra+" ");
        }
    }
}
