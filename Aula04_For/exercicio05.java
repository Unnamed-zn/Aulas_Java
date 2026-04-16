package Aula04;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int soma = 0;
        
        for (int i=1; i<=5; i++) {
            System.out.print("Digite um número:" );
            int num = scan.nextInt();
            soma += num;
        }
        
        int media = soma/5;
        System.out.println("A média entre esses números é "+media);
        
    }
}
