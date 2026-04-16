package Aula06;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        String escolha="";
        int pressao=0;
        
        System.out.println("Vamos começar a encher o pneu da sua bicicleta.");
        Thread.sleep(1500);
        do {
            System.out.println("\nVamos dar uma bombeada de ar...");
            Thread.sleep(1500);
            pressao+=10;
            System.out.println("\nA pressão no pneu está atualmente em "+pressao+".");
            Thread.sleep(1500);
            System.out.print("\nO pneu já está cheio? ");
            escolha=scan.nextLine().toLowerCase();
        } while (!(escolha.equals("sim") || escolha.equals("s")));
    }
}
