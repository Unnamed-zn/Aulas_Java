package Aula_3;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite alguma coisa: ");
        String termo = scan.nextLine();
        
        boolean contem = termo.matches(".*[aeiouAEIOU].*");
        
        if (contem==true) {
            System.out.println("O texto contém ao menos uma vogal.");
        } else {
            System.out.println("O texto não contém vogal.");
        }
        
    }
}
