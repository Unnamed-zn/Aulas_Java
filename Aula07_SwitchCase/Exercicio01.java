package Aula07;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 7: ");
        int num = scan.nextInt();
        
        switch (Math.min(num, 8)) {
            case 1 -> System.out.println("O dia da semana correspondente é domingo");
            case 2 -> System.out.println("O dia da semana correspondente é segunda feira");
            case 3 -> System.out.println("O dia da semana correspondente é terça feira");
            case 4 -> System.out.println("O dia da semana correspondente é quarta feira");
            case 5 -> System.out.println("O dia da semana correspondente é quinta feira");
            case 6 -> System.out.println("O dia da semana correspondente é sexta feira");
            case 7 -> System.out.println("O dia da semana correspondente é sábado");
            case 8 -> System.out.println(num+" não tem um dia da semana correspondente.");
        }
        
    }
}
