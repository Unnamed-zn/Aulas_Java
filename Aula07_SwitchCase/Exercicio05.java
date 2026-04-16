package Aula07;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 12: ");
        int num = scan.nextInt();
        
        switch (num) {
            case 1 -> System.out.println("O mês correspondente é janeiro");
            case 2 -> System.out.println("O mês correspondente é fevereiro");
            case 3 -> System.out.println("O mês correspondente é março");
            case 4 -> System.out.println("O mês correspondente é abril");
            case 5 -> System.out.println("O mês correspondente é maio");
            case 6 -> System.out.println("O mês correspondente é junho");
            case 7 -> System.out.println("O mês correspondente é julho");
            case 8 -> System.out.println("O mês correspondente é agosto");
            case 9 -> System.out.println("O mês correspondente é setembro");
            case 10 -> System.out.println("O mês correspondente é outubro");
            case 11 -> System.out.println("O mês correspondente é novembro");
            case 12 -> System.out.println("O mês correspondente é dezembro");
            default -> System.out.println(num+" não tem um mês correspondente.");
        }
        
    }
}
