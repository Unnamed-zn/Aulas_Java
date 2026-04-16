package Aula_3;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double numero1 = scan.nextDouble();
        
        System.out.print("Digite outro número:");
        double numero2 = scan.nextDouble();
        
        if (numero1 > numero2) {
            System.out.println(numero1+" é maior");
        } else {
            System.out.println(numero2+" é maior");
        }
        
    }
}
