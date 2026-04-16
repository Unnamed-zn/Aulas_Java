package Aula04;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um caractere: ");
        char caractere = scan.next().charAt(0);
        
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        
        for (int i=1; i<=num; i++) {
            System.out.println(caractere);
        }
        
        
    }
}
