package Aula08;

import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        Random rd = new Random();
        double num;
        double media=0;
        double[] numerosDecimais = new double[10];
        for (int i=0; i<10; i++) {
            num = Math.round((rd.nextDouble(10)+1)*100);
            numerosDecimais[i] = num/100;
        }
        System.out.println("Os números gerados foram:");
        for (double numero : numerosDecimais) {
            System.out.println(numero);
            media+=numero;
        }
        media=media/10;
        System.out.println("A média desses números é "+media);
    } 
}