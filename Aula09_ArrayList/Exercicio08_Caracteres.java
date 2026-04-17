package Aula09_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio08_Caracteres {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Character> letras = new ArrayList<Character>();
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a primeira letra: ");
            letras.add(scan.next().charAt(0));
        }
        
        System.out.println("Lista de Letras: "+letras.toString());
    }
}
