package Aula04;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite um numero inicial: ");
        int inicio = scan.nextInt();
        
        System.out.println("Digite um numero final: ");
        int fim = scan.nextInt();
        
        System.out.println("Digite um incremento:");
        int incremento = scan.nextInt();
        
        int atual = 0;
        int contador = 0;
        
        for (int i = inicio; i<=fim; i+=incremento) {
            atual = i; 
            System.out.println("Numero atual: "+atual);
            contador ++;
        }
        
        System.out.println("Valores obtidos até o final: "+contador);
        
    }
}