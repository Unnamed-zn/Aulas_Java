package Aula08;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double[] notas = new double[4];
        for (int i=1; i<=4; i++) {
            System.out.print("Digite a nota no "+i+"° bimestre: ");
            notas[i-1] = scan.nextDouble();
        }
        double media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
        System.out.println("Sua média geral é de "+df.format(media)+".");
    }
}
