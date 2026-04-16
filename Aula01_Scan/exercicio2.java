package projeto_java_1;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();
        
        System.out.println("O antecessor de " + numero + " é " + (numero-1) + " e o sucessor é " + (numero+1));
        
    }
}