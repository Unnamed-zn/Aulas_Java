package Aula_3;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        
        System.out.print("Digite seu gênero: ");
        String genero = scan.nextLine().toLowerCase();
        
        System.out.print("Digite o preço do produto: ");
        double preco = scan.nextDouble();
        
        boolean feminino = ("feminino".equals(genero)) || ("mulher".equals(genero)) || ("f".equals(genero));
        boolean masculino = ("masculino".equals(genero)) || ("homem".equals(genero)) || ("m".equals(genero)) || ("macho".equals(genero));
        
        if (feminino==true) {
            System.out.println("O produto com desconto especial sai por R$"+(preco*0.87)+", feliz dia da mulher, "+nome+"!"); 
        } else if (masculino==true) {
            System.out.println("O produto com desconto sai por R$"+(preco*0.95)+", tenha um bom dia, "+nome+".");
        } else {
            System.out.println("Gênero informado não reconhecido, verifique a ortografia e tente novamente.");
        }
        
    }
}