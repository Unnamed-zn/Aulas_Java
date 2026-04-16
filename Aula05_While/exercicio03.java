package Aula05;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo para exibirmos a tabuada deste número: ");
        double numero = scan.nextDouble();
        
        int contador=1;
        
        while ((numero<0) || (numero-(int)numero!=0) ) {
            System.out.println("Número inválido, tente novamente. ");
            System.out.print("Digite um número: ");
            numero = scan.nextDouble();
        }
        
        while (contador<=10) {
            System.out.println((int)numero+" x "+contador+" = "+(int)(contador*numero));
            contador++;
        }
    }
}