package Aula09_ArrayList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio05_Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        ArrayList<Double> notas = new ArrayList<Double>();
        for (int i=1; i<=4; i++) {
            System.out.print("Digite a nota no "+i+"° bimestre: ");
            notas.add(scan.nextDouble());
        }
        double media = (notas.get(0)+notas.get(1)+notas.get(2)+notas.get(3))/4;
        System.out.println("Sua média geral é de "+df.format(media)+".");
    }
}
