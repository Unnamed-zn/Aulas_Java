package projeto_java_1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Quantos reais você tem? ");
        double reais = scan.nextDouble();
        
        DecimalFormat limite = new DecimalFormat("0.00");
        
        double dolares = reais/5.45; 
        
        System.out.println("R$" + reais + " podem comprar US$" + limite.format(dolares) + ".");
        
    }
}