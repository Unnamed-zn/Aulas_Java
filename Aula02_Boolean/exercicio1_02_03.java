package exercicios02_03;

import java.util.Scanner;

public class exercicio1_02_03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira um ano: ");
        int ano = scan.nextInt();
        
        boolean bissexto = (((ano%4==0) && (ano%100!=0)) || (ano%400==0));
        
        if (bissexto == true) {
            System.out.println("O ano de "+ano+" é bissexto");
        } else {
            System.out.println("Não, o ano de "+ano+" não é bissexto");
        }
        
    }
}