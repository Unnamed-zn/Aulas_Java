package exercicios02_03;

import java.util.Scanner;

public class exercicio3_02_03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Qual sua idade? ");
        int idade = scan.nextInt();
        
        boolean maioridade = (idade>=18);
        
        if (maioridade ==true) {
            System.out.println("Você pode dirigir. (Se tiver carteira)");
        } else {
            System.out.println("Você não pode dirigir.");
        }
        
    }
}