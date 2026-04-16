package Aula_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Qual a velocidade do carro na via? ");
        double velocidade = scan.nextDouble();
        
        DecimalFormat limite = new DecimalFormat ("0.00");
        
        if (velocidade > 80) {
            double multa = (velocidade-80)*5;
            
            System.out.println("Velocidade acima do limite estabelecido, multa de R$"+limite.format(multa));
        } else {
            System.out.println("Velocidade dentro do limite, sem multa a ser aplicada.");
        }
        
    }
}