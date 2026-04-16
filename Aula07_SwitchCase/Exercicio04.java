package Aula07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        double soma=0;
        char certeza;
        int escolha=0;
        do {
            System.out.println(soma);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("    OFERTAS PALHAÇO TRISTE     ");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1. Big Tristeza (R$23,90)");
            System.out.println("2. Lanche Deprê Kids (R$29,90)");
            System.out.println("3. Cheddar Sad Burguer (R$24,90)");
            System.out.println("4. Quarteirão Deprimido (R$31,50)");
            System.out.println("5. Coca Cola 600ml (R$5,90)");
            System.out.println("6. Coca Zero 600ml (R$5,90)");
            System.out.println("7. Batata Média (R$10,99)");
            System.out.println("8. Batata Grande (R$13,99)");
            System.out.println("9. Encerrar pedido");
            
            System.out.print("Digite o número para adicionar ao carrinho: ");
            escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    System.out.print("Tem certeza que deseja adicionar Big Tristeza ao seu carrinho(s/n)? ");
                    certeza = scan.next().charAt(0);
                    switch (certeza) {
                        case 's':
                            soma+=23.90;
                            break;
                        case 'n':
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Tem certeza que deseja adicionar Lanche Deprê Kids ao seu carrinho(s/n)? ");
                    certeza = scan.next().charAt(0);
                    switch (certeza) {
                        case 's':
                            soma+=29.90;
                            break;
                        case 'n':
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Tem certeza que deseja adicionar Cheddar Sad Burguer ao seu carrinho(s/n)? ");
                    certeza = scan.next().charAt(0);
                    switch (certeza) {
                        case 's':
                            soma+=24.90;
                            break;
                        case 'n':
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Tem certeza que deseja adicionar Quarteirão Deprimido ao seu carrinho(s/n)? ");
                    certeza = scan.next().charAt(0);
                    switch (certeza) {
                        case 's':
                            soma+=31.50;
                            break;
                        case 'n':
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.print("Tem certeza que deseja adicionar Coca Cola 600ml ao seu carrinho(s/n)? ");
                    certeza = scan.next().charAt(0);
                    switch (certeza) {
                        case 's':
                            soma+=5.90;
                            break;
                        case 'n':
                            break;
                        default:
                            break;
                    }
                    break;
                case 6:
                    System.out.print("Tem certeza que deseja adicionar Coca Zero 600ml ao seu carrinho(s/n)? ");
                    certeza = scan.next().charAt(0);
                    switch (certeza) {
                        case 's':
                            soma+=5.90;
                            break;
                        case 'n':
                            break;
                        default:
                            break;
                    }
                    break;
                case 7:
                    System.out.print("Tem certeza que deseja adicionar Batata Média ao seu carrinho(s/n)? ");
                    certeza = scan.next().charAt(0);
                    switch (certeza) {
                        case 's':
                            soma+=10.99;
                            break;
                        case 'n':
                            break;
                        default:
                            break;
                    }
                    break;
                case 8:
                    System.out.print("Tem certeza que deseja adicionar Batata Grande ao seu carrinho(s/n)? ");
                    certeza = scan.next().charAt(0);
                    switch (certeza) {
                        case 's':
                            soma+=13.99;
                            break;
                        case 'n':
                            break;
                        default:
                            break;
                    }
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Escolha inválida, tente novamente.");
            }
        } while(escolha!=9);
        if (soma>=30) {
            System.out.println("Promoção especial! Todas as compras em um valor de ao menos R$30,00 tem um desconto de 15%.");
            System.out.println("Seu pedido saiu de R$"+df.format(soma)+" para R$"+df.format(soma/100*85));
            System.out.println("Bom proveito!");
        } else {
            System.out.println("Seu pedido saiu por R$"+df.format(soma)+", bom proveito.s");
        }
    }
}
