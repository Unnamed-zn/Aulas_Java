package Aula07;

import java.util.Scanner;

public class Exercicio07 {
    public static int num;
    public static void main(String[] args) {
        Exercicio07.escaneando();
    }
    public static void switando() {
        switch (Math.min(num, 8)) {
            case 1:
                System.out.println("É domingo! Dia de folgar.");
                break;
            case 2:
                System.out.println("É dia de trampo...");
                break;
            case 3:
                System.out.println("É dia de trampo...");
                break;
            case 4:
                System.out.println("É dia de trampo...");
                break;
            case 5:
                System.out.println("É dia de trampo...");
                break;
            case 6:
                System.out.println("SEXTOU! Aguenta só mais hoje, ainda é dia de trampo.");
                break;
            case 7:
                System.out.println("SABADOOOOOOOOOOOOOOOOU!");
                break;
            case 8:
                System.out.println("Eu mandei digitar um de 1 a 7, não sabe ler não?.");
                Exercicio07.escaneando();
                break;
        }
    }
    public static void escaneando() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        num = scan.nextInt();
        Exercicio07.switando();
    }
}
