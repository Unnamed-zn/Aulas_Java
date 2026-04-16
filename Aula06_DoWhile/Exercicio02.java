package Aula06;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;
        double soma=0;
        int contador=1;
        
        do {
            System.out.print("Digite a nota no "+contador+"º bimestre: ");
            nota=scan.nextDouble();
            
            if (nota<0 || nota>10){
                System.out.println("Nota informada inválida, tente novamente.");
            } else {
                soma+=nota;
                contador++;
            }
        } while (contador<=4);
        System.out.println("A média no ano letivo foi de "+soma/contador+" pontos.");
    }
}