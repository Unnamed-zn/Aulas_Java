package Aula10_HashSet;

import java.util.HashSet;
import java.util.Set;

public class praticando {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Morango");
        frutas.add("Laranja");
        frutas.add("Maçã");
        frutas.add("Morango");
        
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        
        if(frutas.contains("Uva")) {
            System.out.println("Temos uva.");
        }
    }
}
