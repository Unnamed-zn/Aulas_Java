package Aula04;

import java.util.Random;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();
        
        int numero = gerador.nextInt(100)+1;
        
        int tentativa = 0;
        
        System.out.println("Jogo da adivinhação! Geramos um número aleatório entre 1 e 100, quer tentar adivinhar? Você terá 7 tentativas.");
                
        for (int i=1; i<=7; i++) {
            System.out.print("Tentativa número "+i+", digite um número: ");
            tentativa = scan.nextInt();
            
            if (tentativa==numero) {
                System.out.println("Parabéns! O número gerado era "+numero+", você venceu!");
                break;
            } else if (tentativa>numero) {
                System.out.println("Tentativa incorreta, o número é menor que "+tentativa+".");
            } else {
                System.out.println("Tentativa incorreta, o número é maior que "+tentativa+".");
            }
            
            if (i==7) {
                System.out.println("Tentativas encerradas, você perdeu.");
            } else {
                System.out.println("Tente novamente.");
            }
            
        }
        
    }
}