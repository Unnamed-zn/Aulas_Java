package Aula07;

import java.util.Scanner;

public class Exercicio06 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite sua nota na disciplina: ");
        String nota = scan.nextLine().toLowerCase();
        char notaChar = nota.charAt(0);
        switch (notaChar) {
            case 'a':
                System.out.println("Incrível! Seu desempenho foi excepcional, está aprovado.");
                break;
            case 'b':
                System.out.println("Ótimo, você teve uma boa nota, está aprovado.");
                break;
            case 'c':
                System.out.println("Satisfatório, mas poderia ser melhor, aprovado.");
                break;
            case 'd':
                System.out.println("O suficiente, sua nota está no limite da aprovação, se dedique mais nas próximas.");
                break;
            case 'f':
                System.out.print("Você fez a recuperação (s/n)? ");
                String escolha = scan.nextLine().toLowerCase();
                char escolhaChar = escolha.charAt(0);
                if (escolhaChar=='s') {
                    System.out.println("Aguarde o resultado da recuperação e tente novamente com a nova nota.");
                } else {
                    System.out.println("Faça imediatamente a recuperação, caso contrário, será reprovado.");
                }
                break;
        }
    }
}
