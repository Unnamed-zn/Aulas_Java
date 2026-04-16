package Aula06;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;
        String usuario="";
        int idade=0;
        String genero="";
        do {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Sair");
            System.out.println("==========================");

            System.out.print("Digite sua escolha: ");
            escolha = scan.nextInt();
            System.out.println("");
            if (escolha==1) {
                scan.nextLine();
                System.out.print("Digite seu usuário: ");
                usuario = scan.nextLine();
                System.out.print("Digite sua idade: ");
                idade = scan.nextInt();
                System.out.print("Digite seu gênero: ");
                scan.nextLine();
                genero = scan.nextLine();
            } else if (escolha==2) {
                if (usuario.equals("")) {
                    System.out.println("Nenhum usuário cadastrado.");
                } else {
                    System.out.println("Nome de usuário: "+usuario);
                    System.out.println("Idade do usuário: "+idade);
                    System.out.println("Gênero do usuário: "+genero);
                }
            }
            System.out.println("");
        } while(escolha!=3);
    }
}
