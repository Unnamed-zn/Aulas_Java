package Aula06;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String escolha="";
        do {
            System.out.print(escolha);
            System.out.println("");
            System.out.print("Digite alguma coisa: ");
            escolha=scan.nextLine();
            
            
        } while(!(escolha.equals("cala a boca porra") || escolha.equals("cala a boca porra!")));
        
        System.out.println("Nossa, tá bom, só não precisava agredir.");
    }
}
