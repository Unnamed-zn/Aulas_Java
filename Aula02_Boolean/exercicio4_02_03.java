package exercicios02_03;

import java.util.Scanner;

public class exercicio4_02_03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numero = scan.nextInt();
        
        boolean estaEntre10e20 = ((numero>=10) & (numero<=20));
        
        if (estaEntre10e20 == true) {
            System.out.println("O número digitado esta entre 10 e 20");
        } else {
            System.out.println("O número não esta entre 10 e 20");
        }
        
    }
}