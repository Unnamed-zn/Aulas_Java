package Aula11_Matrizes;

//import java.util.Random;
import java.util.Scanner;

public class Exercicio04_SomasDiagonais {
    public static void main(String[] args) {
        //Random rd = new Random();
        int somaPrincipal = 0;
        int somaSecundaria = 0;
        int[][] matriz = new int[3][3];
        Scanner scan = new Scanner(System.in);
        
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                //matriz[l][c] = rd.nextInt(11);
                System.out.print("["+matriz[l][c]+"]\t");
                System.out.print("Digite o termo ["+l+"]["+c+"]: ");
                while (true) {
                    if (scan.hasNextInt()) {
                        matriz[l][c] = scan.nextInt();
                        break;
                    } else {
                        System.out.println("Entrada inválida, digite um número.");
                        scan.next();
                        System.out.print("Digite o termo ["+l+"]["+c+"]: ");
                    }
                }
            }
            System.out.println();
        }
        
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (l==c) somaPrincipal+= matriz[l][c];
                if (c==(matriz.length-(l+1))) somaSecundaria+= matriz[l][c];
            }
        }
        System.out.println("Soma da diagonal principal: "+somaPrincipal);
        System.out.println("Soma da diagonal secundária: "+somaSecundaria);
    }
}
