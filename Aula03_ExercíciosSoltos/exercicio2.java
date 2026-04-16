package Aula_3;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        
        if (idade>=16) {
            System.out.println("O cidadão tem direito a voto.");
        } else {
            System.out.println("Idade insuficiente para votar.");
        }
        
    }
}
