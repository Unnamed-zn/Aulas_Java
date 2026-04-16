package projeto_java_1;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Quantos dias tu trabalhou meu cupincha? ");
        int dias = scan.nextInt();
        
        System.out.println("Uepa, se tu trabalhou " + dias + " dias esse mês teu salário vai ser de " + dias*8*25 + " reais, fechou?");
        
    }
}