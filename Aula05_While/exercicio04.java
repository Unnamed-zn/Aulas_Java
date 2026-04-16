package Aula05;

import java.util.Scanner;
import java.util.Random;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rn = new Random();
        
        String paridade = "par";
        int numero = 0;
        
        System.out.println("Vamos jogar par ou ímpar!");
        while (!paridade.equals("sair")) {
            System.out.print("Vai escolher par ou ímpar? (Você pode digitar 'sair' para sair do jogo) ");
            paridade = scan.nextLine().toLowerCase();
            if (paridade.equals("sair")) {
                break;
            } 
            while (!(paridade.equals("par") || paridade.equals("impar") || paridade.equals("ímpar"))) {
                System.out.println(paridade+" não é uma opção válidade, tente novamente (Você pode digitar 'sair' para sair do jogo.)");
                System.out.print("Par ou impar? ");
                paridade = scan.nextLine().toLowerCase();
                if (paridade.equals("sair")) {return;}
            }
            System.out.print("Então você vai de "+paridade+", digite um número de 0 a 5: ");
            numero = scan.nextInt();
            scan.nextLine();
            while (numero <0 && numero >5) {
                System.out.println("O número deve ser de 0 a 5, tente novamente.");
                System.out.print("Digite um número de 0 a 5: ");
                numero = scan.nextInt();
                scan.nextLine();
            }
            int numeroComputador = rn.nextInt(5)+1;
            
            boolean vitoria = (((numero+numeroComputador)%2==0) && (paridade.equals("par"))) || (((numero+numeroComputador)%2==1) && ((paridade.equals("impar")) || (paridade.equals("ímpar"))));
            
            if (vitoria==true) {
                System.out.println("Eu escolhi "+numeroComputador+", a soma é "+(numero+numeroComputador)+" e você escolheu "+paridade+", você venceu!");
            } else {
                System.out.println("Eu escolhi "+numeroComputador+", a soma é "+(numero+numeroComputador)+" e você escolheu "+paridade+", eu ganhei, mais sorte na próxima!");
            }
        }
        return;
    }
}
