package Aula10_02;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio07_FiltrodeNumerosPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numerosArray = new int[10];
        HashSet<Integer> numerosHash = new HashSet<>();
        String numeroString;
        int numero;
        int contador = 0;
        int tolerancia = 5;
        do {
            System.out.print("Digite um número: ");
            numeroString = scan.nextLine();
            try {
                numero = Integer.parseInt(numeroString);
                numerosArray[contador] = numero;
                contador++;
            } catch (NumberFormatException e) {
                tolerancia--;
                if (tolerancia>0) {
                    System.out.println(numeroString+" não é um numérico ou é alfanumérico, digite apenas números.");
                } else {
                    System.out.println("Você é burro ou se faz? Eu já te disse mais de 5 vezes, DIGITE APENAS NÚMEROS!");
                }
            }
        } while (contador<10);
        for (int num : numerosArray) {
            if (num%2==0) {
                numerosHash.add(num);
            }
        }
        System.out.println("Os números pares digitados foram: "+numerosHash.toString());
    }
}