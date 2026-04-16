package Aula_3;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = scan.nextLine();
        
        System.out.print("Digite a nota no primeiro semestre: ");
        double nota1 = scan.nextDouble();
        
        System.out.print("Digite a nota no segundo semestre: ");
        double nota2 = scan.nextDouble();
        
        double media = (nota1+nota2)/2;
        
        if (media>=7) {
            System.out.println("O aluno "+nome+" foi aprovado na disciplina com média "+media);
        } else {
            System.out.println("O aluno "+nome+" recebeu média "+media+" está reprovado por não ter atingido o desempenho esperado.");
        }
        
    }
}