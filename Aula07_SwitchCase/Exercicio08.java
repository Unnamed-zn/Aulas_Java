package Aula07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        char escolha;
        double saldo=0;
        do {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("        CAIXA        ");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1. Ver Saldo;");
            System.out.println("2. Fazer um Depósito;");
            System.out.println("3. Realizar um Saque;");
            System.out.println("4. Sair.\n");
            System.out.print("Digite sua escolha: ");
            escolha = scan.next().charAt(0);
            switch (escolha) {
                case '1':
                    System.out.println("\nSeu saldo atual é R$"+df.format(saldo)+".\n");
                    break;
                case '2':
                    System.out.print("\nDigite o valor para depositar: ");
                    saldo+=scan.nextDouble();
                    System.out.println("");
                    break;
                case '3':
                    System.out.print("\nDigite o valor para sacar: ");
                    saldo-=scan.nextDouble();
                    break;
                default:
                    System.out.println("\nValor digitado inválido, tente novamente.\n");
                    break;
            }
        } while(escolha!='4');
    }
}
