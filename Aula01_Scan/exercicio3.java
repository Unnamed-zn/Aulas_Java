package projeto_java_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double numero = scan.nextDouble();
        
        double dobro = numero*2;
        
        double um_terco = numero/3;
        DecimalFormat limite = new DecimalFormat("0.0000");
        
        System.out.println("O dobro de " + numero + " é " + dobro + " e a terça parte é " + limite.format(um_terco) + ".");
        
    }
}

/*
public class exercicio3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double numero = scan.nextDouble();
        
        double dobro = numero*2;
        
        double um_terco = numero/3;
        
        System.out.println("O dobro de " + numero + " é " + dobro + " e a terça parte é "+String.format("%.4f",um_terco)+".");
        
    }
}
*/