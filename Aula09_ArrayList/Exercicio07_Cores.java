package Aula09_ArrayList;

import java.util.ArrayList;

public class Exercicio07_Cores {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<String>();
        cores.add("azul");
        cores.add("verde");
        cores.add("vermelho");
        
        if (cores.contains("amarelo")) {
            System.out.println("A lista de cores "+cores.toString()+" contém amarelo.");
        } else {
            System.out.println("A lista de cores "+cores.toString()+" não contém amarelo.");
        }
    }
}
