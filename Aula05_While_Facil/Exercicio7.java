package Aula05_1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat ("0.00");
        
        double meta;
        double dinheiro=0;
        
        System.out.print("Qual valor do item que deseja comprar? ");
        meta = scan.nextDouble();
        while (dinheiro<meta) {
            System.out.print("Quanto deseja guardar no cofre? ");
            dinheiro += scan.nextDouble();
            if (dinheiro>meta) {break;}
            System.out.println("Seu cofre atualmente tem R$"+formato.format(dinheiro)+", faltam R$"+formato.format(meta-dinheiro)+" para poder comprar o item desejado.");
        }
        System.out.println("Seu cofre está cheio, pode comprar o produto desejado.");
    }
}