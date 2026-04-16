package Aula05;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String senha = "1234";
        String tentativa = "";
        int contador = 1;
        
        while (contador<=3 & !tentativa.equals(senha)) {
            System.out.print("Verificando identidade, digite sua senha: ");
            tentativa = scan.nextLine();
            contador++;
        }
        
        if (tentativa.equals(senha)) {
            System.out.println("Senha confirmada, seja bem vindo, JoãozinhoDoCapa123");
        } else {
            System.out.println("Limite de tentativas excedido, tente novamente mais tarde.");
        }
        
    }
}