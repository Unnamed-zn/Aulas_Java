package projeto_java_1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: ");
        double preco = scan.nextDouble();
        
        double preco_descontado = (preco/100)*95;
        
        DecimalFormat limite = new DecimalFormat ("0.00");
        
        System.out.println("Aplicando um desconto de 5% o produto que custava R$" + preco + " passará a custar R$" + limite.format(preco_descontado) + ".");
        
    }
}