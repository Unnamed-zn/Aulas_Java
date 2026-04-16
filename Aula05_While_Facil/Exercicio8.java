package Aula05_1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senha="PedrinhoDoGrau123";
        String tentativa="";
        
        System.out.print("Você está tentando acessar espaço restrito, digite a senha: ");
        tentativa=scan.nextLine();
        
        while (!tentativa.equals(senha)) {
            System.out.println("Senha incorreta, tente novamente.");
            System.out.print("Digite a senha: ");
            tentativa=scan.nextLine();
        }
        
        System.out.println("Acesso liberado, bem vindo PedrinhoReiDoCapa123.");
    }
}
