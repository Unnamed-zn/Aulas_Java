package exercicios02_03;

import java.util.Scanner;


public class exercicio6_02_03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Qual sua nota na disciplina? ");
        int nota = scan.nextInt();
        
        System.out.print("Qual sua frequencia? ");
        int frequencia = scan.nextInt();
        
        boolean aprovado = ((nota>=60) & (frequencia>=75));
        
        if (aprovado == true) {
            System.out.println("Você está aprovado, parabéns!");
        } else {
            System.out.println("Você está reprovado, boa sorte na próxima vez.");
        }
        
    }
}