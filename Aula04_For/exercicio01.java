package Aula04;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" x "+i+" = "+(i*num));
        }
        
    }
}
