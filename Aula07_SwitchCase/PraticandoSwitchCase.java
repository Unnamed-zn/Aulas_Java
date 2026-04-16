package Aula07;

import java.util.Scanner;


public class PraticandoSwitchCase {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("        Menu Inicio        ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("1. Novo arquivo;");
        System.out.println("2. Salvar arquivo;");
        System.out.println("3. Salvar como;");
        System.out.println("4. Sair sem salvar;");
        System.out.println("5. Fechar programa.");
        int opcao = scan.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Arquivo criado.");
                break;
            case 2:
                System.out.println("Arquivo salvo.");
                break;
            case 3:
                System.out.print("Com que nome deseja salvar? ");
                scan.nextLine();
                String nome = scan.nextLine();
                System.out.println("Arquivo salvo como "+nome+".");
                break;
            case 4:
                System.out.println("Fechando o programa...");
                Thread.sleep(5000);
                return;
            case 5:
                return;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
