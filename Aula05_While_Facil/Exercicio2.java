package Aula05_1;

public class Exercicio2 {
    public static void main(String[] args) {
        int fatiasDePizza=8;
        
        while (fatiasDePizza>0) {
            fatiasDePizza--;
            if (fatiasDePizza==0) {
                System.out.println("Comi de mais, tô cheio!");
            } else {
                System.out.println("Comi uma fatia de pizza! Ainda tenho "+(fatiasDePizza)+" fatias.");
            }
        }
    }
}
