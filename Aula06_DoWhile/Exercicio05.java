package Aula06;

import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        int escolha;
        
        System.out.println("Jogo da adivinhação! Geraremos um número aleatório para você tentar acertar. A cada erro, informaremos se o número alvo é maior ou menor que o valor digitado por você.");
        Thread.sleep(3000);
        System.out.println("Estamos gerando o número alvo, aguarde...");
        Thread.sleep(3000);
        int numeroAlvo=rd.nextInt(100)+1;
        System.out.println("Número alvo gerado!");
        do {
            System.out.print("Digite um número: ");
            escolha=scan.nextInt();
            if (escolha>numeroAlvo) {
                System.out.println("Número incorreto, o número alvo é menor que "+escolha+".");
            } else if (escolha<numeroAlvo) {
                System.out.println("Número incorreto, o número alvo é maior que "+escolha+".");
            } else {}
        } while (escolha!=numeroAlvo);
        System.out.println("Parabéns! O número alvo era "+numeroAlvo+", você venceu!");
    }
}
