package Aula05;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String sair = " ";
        int idade = 0;
        int soma = 0;
        int contador = 0;
        
        System.out.println("Vamos calcular a média da idade dos alunos, digite a idade deles (digite 'calcular' para iniciar o cálculo.)");
        
        while (contador>=0) {
            System.out.print("Idade do "+(contador+1)+"° aluno: ");
            sair = scan.nextLine();
            
            if (sair.equalsIgnoreCase("calcular")) {
                break;
            }
            
            idade = Integer.parseInt(sair);
            soma += idade;
            contador ++;
            
            
        }
        
        if (contador==0) {
            System.out.println("Nenhuma idade informada, impossível calcular.");
        } else {
            System.out.println("A média das idades dos alunos é "+(soma/contador));
        }
        
    }
}
