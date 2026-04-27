package Aula10_02;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02_SistemaLogin {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        HashSet<String> usuarios = new HashSet<>(Arrays.asList("luís", "bernardo", "bryan", "josé", "daniel", "pablo", "pietro", "gabriel"));
        System.out.println("=-=-= SISTEMA DE LOGIN =-=-=");
        System.out.print("Digite seu nome de usuário: ");
        String nome = scan.nextLine().toLowerCase();
        if (usuarios.contains(nome)) {
            System.out.println("Bem vindo, "+nome+".");
        } else {
            System.out.println("Usuário não registrado, adicionando ao sistema...");
            Thread.sleep(2000);
            usuarios.add(nome);
            System.out.println("Usuário adicionado.");
        }
        System.out.println("--- Lista de usuários ---");
        for (String nomes : usuarios) {
            System.out.println(nomes);
        } 
    }
}
