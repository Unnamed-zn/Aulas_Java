package Aula09_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04_PesquisaAlunos {
    public static void main(String[] args) {
        Scanner scanstring = new Scanner(System.in);
        Scanner scanint = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<String>();
        
        System.out.print("Quantos alunos adicionará à lista? ");
        int tamanho = scanint.nextInt();
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o nome do "+(i+1)+"° aluno: ");
            alunos.add(scanstring.nextLine());
        }
        System.out.print("Qual nome deseja verificar? ");
        String alvo = scanstring.nextLine();
        
        if (alunos.contains(alvo)) {
            System.out.println("O aluno "+alvo+" foi encontrado no "+(alunos.indexOf(alvo)+1)+"° item da lista: ");
        } else {
            System.out.println("Aluno "+alvo+" não encontrado.");
        }
    }
}
