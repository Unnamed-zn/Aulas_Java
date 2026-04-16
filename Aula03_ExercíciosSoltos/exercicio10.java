package Aula_3;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um dia da semana: ");
        String diaSemana = scan.nextLine().toLowerCase();
        
        boolean diaUtil = ( ("segunda".equals(diaSemana)) || ("terça".equals(diaSemana)) || ("quarta".equals(diaSemana)) || ("quinta".equals(diaSemana)) || ("sexta".equals(diaSemana)) );
        boolean fimDeSemana = ( ("sábado".equals(diaSemana)) || ("sabado".equals(diaSemana)) || ("domingo".equals(diaSemana)) );
        
        if (diaUtil==true) {
            System.out.println(diaSemana+" é um dia útil.");
        } else if (fimDeSemana == true) {
            System.out.println(diaSemana+" é fim de semana.");
        } else {
            System.out.println("Dia digitado não reconhecido, tente novamente.");
        }
        
    }
}