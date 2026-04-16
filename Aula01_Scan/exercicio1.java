
package projeto_java_1;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Qual seu nome? ");
        String nome = scan.nextLine();
        
        System.out.print("Digite seu salário: ");
        int salario = scan.nextInt();
        
        System.out.println("Muito prazer, então você é " + nome + " e seu salário é de " + salario + " reais");
        
    }
}