package Aula06;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma=0;
        int num;
        
        do {
            System.out.print("Digite um número (ou 0 para encerrar): ");
            num=scan.nextInt();
            soma+=num;
        } while (num!=0);
        
        System.out.println("A soma dos valores digitados é "+soma+".");
    }
}
