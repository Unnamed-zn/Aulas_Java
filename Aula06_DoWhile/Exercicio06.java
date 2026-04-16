package Aula06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        String escolha="";
        int biscoito=1;
        
        System.out.println("Você fica com fome, e decide comer alguns biscoitinhos da sorte.");
        Thread.sleep(2500);
        do {
            if (biscoito==1) {
                System.out.println("\nVocê pega o primeiro biscoitinho, o come e pega o papelzinho.");
            } else {
                System.out.println("\nVocê pega mais um biscoitinho, come-o novamente e pega o papel.");
            }
            Thread.sleep(2500);
            if (biscoito<8) {
                switch (biscoito) {
                    case 1 -> Exercicio06.Texto1();
                    case 2 -> Exercicio06.Texto2();
                    case 3 -> Exercicio06.Texto3();
                    case 4 -> Exercicio06.Texto4();
                    case 5 -> Exercicio06.Texto5();
                    case 6 -> Exercicio06.Texto6();
                    case 7 -> Exercicio06.Texto7();
                }    
            } else {
                Exercicio06.Texto8();
            }
            
            biscoito++;
            Thread.sleep(2500);
            System.out.print("\nDeseja pegar um novo biscoito? ");
            escolha=scan.nextLine().toLowerCase();
        } while (!((escolha.equals("não")) || (escolha.equals("n"))));
        System.out.println("\nVocê finalmente desiste de comer os biscoitinhos.");
        Thread.sleep(2500);
        System.out.println("\nVocê está se sentindo meio mal agora.");
        Thread.sleep(2500);
        System.out.println("\nMas não consegue definir se é seu estômago, a ansiedade ou a depressão.");
    }
    public static void Texto1() {
        System.out.println("\n'Você encara na parte mais profunda do seu ser, e não enxerga nada além de escuridão...'");
    }
    public static void Texto2() {
        System.out.println("\n'Você ainda tenta buscar algo que tenha valor em sua alma, mas nada pode ser encontrado lá...'");
    }
    public static void Texto3() {
        System.out.println("\n'Você não acha que está conferindo de mais? Eu já disse, nada pode ser encontrado em seu coração.'");
    }
    public static void Texto4() {
        System.out.println("\n'Eu sinto que isso está ficando repetitivo de mais, independentemente da busca, é apenas um vazio indescritível.'");
    }
    public static void Texto5() {
        System.out.println("\n'Tudo bem, já chega, isso está ficando cansativo, pare, por favor.'");
    }
    public static void Texto6() {
        System.out.println("\n'Eu vou parar de me esforçar se você continuar assim, eu já disse, chega;'");
    }
    public static void Texto7() {
        System.out.println("\n'Tá, tudo bem, aproveite os biscoitos, eu desisto.'");
    }
    public static void Texto8() {
        System.out.println("\nVocê lê o bilhete do biscoito, mas não há conteúdo nele.");
    }
}
