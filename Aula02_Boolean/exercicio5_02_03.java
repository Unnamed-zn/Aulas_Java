package exercicios02_03;

import java.util.Scanner;

public class exercicio5_02_03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        
        boolean divisivel3ou7 = ((numero%3==0) | (numero%7==0));
        
        if (divisivel3ou7 ==true) {
            System.out.println("Sim, o número pode ser dividido por 3 ou 7");
        } else {
            System.out.println("Não, o número não pode ser dividido nem por 3 nem por 7");
        }
        
    }
}