package Aula10_02;

import java.util.HashSet;
import java.util.Scanner;

class Exercicio04_AlertadeRepetição {
    public static void main(String[] args) {
        HashSet<String> seila = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        String seila2;
        
        while (true) {
            System.out.println("Digite alguma coisa: ");
            seila2 = scan.nextLine();
            if (seila.contains(seila2)) break;
            seila.add(seila2);
        }
        
        System.out.println("A lista já continha "+seila2+", encerrando.");
    }
}
