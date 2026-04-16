package exercicios02_03;

import java.util.Scanner;

class exercicio2_02_03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        
        boolean par = (numero%2==0);
        
        if (par == true) {
            System.out.println("É par");
        } else {
            System.out.println("Não é par");
        }
        
    }
}