package Aula08;

import java.util.Arrays;

public class Exercicio05 {
    public static void main(String[] args) {
        String[] frutas = {"banana", "pera", "uva", "melancia", "melão", "maçã"};
        Arrays.sort(frutas);
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
