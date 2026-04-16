package Aula_3;

import java.util.Scanner;


public class exercicio9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite seu nome de usuário: ");
        String nome = scan.nextLine();
        boolean nomeValido = nome.matches("^[a-zA-Z0-9ãÃ_]+$");
        
        if (nomeValido==false) {
            System.out.println("Nome inválido, deve conter apenas letras, números e/ou underlines(_), tente novamente.");
            return;
        }
        
        System.out.print("Digite sua senha: ");
        String senha = scan.nextLine();
        boolean senhaValida = !senha.contains(" ") && senha.length()>=6;
        
        if (senhaValida==false) {
            System.out.println("Senha inválida, deve conter ao menos seis caracteres e não pode conter espaços, tente novamente.");
            return;
        }
        
        System.out.println("Acesso liberado, muito bem vindo, "+nome+".");
        
    }
}