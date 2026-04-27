package Aula10_02;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio05_GestordeConvidados {
    public static HashSet<String> convidados = new HashSet<>();
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        Exercicio05_GestordeConvidados.menu();
    }
    public static void menu() throws InterruptedException {
        System.out.println("=-=-= MENU DE CONVIDADOS =-=-=");
        System.out.println("1. Adicionar convidado;");
        System.out.println("2. Remover convidado;");
        System.out.println("3. Ver lista de convidados.");
        System.out.println("4. Sair.");
        System.out.print("\nDigite sua escolha: ");
        int escolhaInt;
        while (true) {
            String escolhaString = scan.nextLine();
            try {
                escolhaInt = Integer.parseInt(escolhaString);
                if (escolhaInt>0 && escolhaInt<5) {
                    break;
                } else {
                    System.out.println("Escolha inválida, tente novamente.");
                    System.out.print("Digite sua escolha: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Escolha inválida, tente novamente.");
                System.out.print("Digite sua escolha: ");
            }
        }
        switch (escolhaInt) {
            case 1 -> Exercicio05_GestordeConvidados.adicionar();
            case 2 -> Exercicio05_GestordeConvidados.remover();
            case 3 -> Exercicio05_GestordeConvidados.verLista();
            case 4 -> System.exit(0);
        }
    }
    public static void adicionar() throws InterruptedException {
        System.out.println("Digite a pessoa para adicionar: ");
        String convidado = Exercicio05_GestordeConvidados.scan.nextLine();
        Exercicio05_GestordeConvidados.convidados.add(convidado);
        System.out.println("Acabamos de adicionar "+convidado+" à lista de convidados.");
        Thread.sleep(2000);
        Exercicio05_GestordeConvidados.menu();
    }
    public static void remover() throws InterruptedException {
        System.out.println("Digite a pessoa para remover: ");
        String convidado = Exercicio05_GestordeConvidados.scan.nextLine();
        if (!Exercicio05_GestordeConvidados.convidados.contains(convidado)) {
            System.out.println("O indivíduo "+convidado+" não estava na lista de convidados.");
        } else {
            Exercicio05_GestordeConvidados.convidados.remove(convidado);
            System.out.println("Acabamos de remover "+convidado+" à lista de convidados.");
        }
        Thread.sleep(2000);
        Exercicio05_GestordeConvidados.menu();
    }
    public static void verLista() throws InterruptedException {
        int contador = 1;
        for (String convidado : Exercicio05_GestordeConvidados.convidados) {
            System.out.println(contador+"- "+convidado);
            contador++;
        }
        Thread.sleep(2000);
        Exercicio05_GestordeConvidados.menu();
    }
}
