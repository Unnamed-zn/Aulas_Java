package Aula07;

import java.util.Scanner;

public class Exercicio02 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int escolha;
        
        do {
            System.out.println("=-=-=-=-=-=-=-=-=-=");
            System.out.println("    Calculadora    ");
            System.out.println("=-=-=-=-=-=-=-=-=-=");
            System.out.println("1. Somar;");
            System.out.println("2. Subtrair;");
            System.out.println("3. Multiplicar;");
            System.out.println("4. Dividir;");
            System.out.println("5. Sair.");
            escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("O resultado é "+Exercicio02.somar());
                    break;
                case 2:
                    System.out.println("O resultado é "+Exercicio02.subtrair());
                    break;
                case 3:
                    System.out.println("O resultado é "+Exercicio02.multiplicar());
                    break;
                case 4:
                    System.out.println("O resultado é "+Exercicio02.dividir());
                    break;
                case 5:
                    return;
                case 6:
                    Exercicio02.escolhaInvalida();
            }
        } while (escolha!=5);
    }
    public static double somar() {
        System.out.print("Quantos números deseja somar? ");
        int escolha = scan.nextInt();
        double num = 0;
        int contador = 1;
        double soma=0;
        
        while (contador<=escolha) {
            System.out.print("Digite o "+contador+"° número: ");
            num = scan.nextDouble();
            soma+=num;
            contador++;
        }
        return soma;
    }
    public static double subtrair() {
        System.out.print("Quantos números deseja subtrair? ");
        int escolha = scan.nextInt();
        double num = 0;
        int contador = 1;
        double subtracao=0;
        
        while (contador<=escolha) {
            System.out.print("Digite o "+contador+"° número: ");
            num = scan.nextDouble();
            subtracao-=num;
            contador++;
        }
        return subtracao;
    }
    public static double multiplicar() {
        System.out.print("Quantos números deseja multiplicar? ");
        int escolha = scan.nextInt();
        double num = 0;
        int contador = 1;
        double produto=0;
        
        while (contador<=escolha) {
            System.out.print("Digite o "+contador+"° número: ");
            num = scan.nextDouble();
            if (contador==1) {
                produto+=num;
            } else {
                produto = produto*num;
            }
            contador++;
        }
        return produto;
    }
    public static double dividir() {
        System.out.print("Quantos númneros deseja dividir? ");
        int escolha = scan.nextInt();
        double num = 0;
        int contador = 1;
        double quociente=0;
        
        while (contador<=escolha) {
            System.out.print("Digite o "+contador+"° número: ");
            num = scan.nextDouble();
            if (contador==1) {
                quociente+=num;
            } else {
                quociente = quociente*num;
            }
            contador++;
        }
        return quociente;
    }
    public static void escolhaInvalida() {
        System.out.print("Escolha inválida, escolha novamente: ");
        int escolha = scan.nextInt();
        switch (escolha) {
            case 1:
                System.out.println(Exercicio02.somar());
            case 2:
                Exercicio02.subtrair();
            case 3:
                Exercicio02.multiplicar();
            case 4:
                Exercicio02.dividir();
            case 5:
                return;
            case 6:
                Exercicio02.escolhaInvalida();
        }
    }
}
