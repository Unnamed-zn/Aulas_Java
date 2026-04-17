package Aula09_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01_ListaStrings {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.print("Quantas coisas deseja adicionar à lista? ");
        int quantia = scan1.nextInt();
        for (int i=1; i<=quantia; i++) {
            System.out.print("Qual será o "+i+"° item? ");
            lista.add(scan2.nextLine());
        }
        for (String item : lista) {
            System.out.println("- "+item);
        }
    }
}
