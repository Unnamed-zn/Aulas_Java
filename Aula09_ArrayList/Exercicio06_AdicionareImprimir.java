package Aula09_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio06_AdicionareImprimir {
    public static void main(String[] args) {
        Scanner scanstring = new Scanner(System.in);
        Scanner scanint = new Scanner(System.in);
        ArrayList<String> cidades = new ArrayList<String>();
        
        System.out.print("Quantas cidades adicionará à lista? ");
        int tamanho = scanint.nextInt();
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o nome da "+(i+1)+"ª cidade: ");
            cidades.add(scanstring.nextLine());
        }
        
        for (String i : cidades) {
            System.out.println("- "+i);
        }
    }
}
