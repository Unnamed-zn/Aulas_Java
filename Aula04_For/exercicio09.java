package Aula04;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Digite um número: ");
        int atual = scan.nextInt();
        int maior = atual;
        int menor = atual;
        
        for (int i = 1; i < 7; i++) {
            System.out.print("Digite um número: ");
            atual = scan.nextInt();
            
            if (atual>=maior) {
                maior = atual;
            }
            
            if (atual<=menor) {
                menor = atual;
            }
            
        }
        
        System.out.println("O maior número entre os digitados é "+maior+" e o menor é "+menor);
        
    }
}
