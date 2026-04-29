package Aula11_Matrizes;

//import java.util.Random;
import java.util.Scanner;

public class Exercicio05_Multiplicação {
    public static void main(String[] args) {
        //Random rd = new Random();
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matrizProduto = new int[matriz.length][matriz[0].length];
        
        
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                //matriz[l][c] = rd.nextInt(11);
                
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
        }
        
        int fator = 0;
        System.out.println("Qual será o fator da multiplicação? ");
        while (true) {
            if (scan.hasNextInt()) {
                fator = scan.nextInt();
                break;
            } else {
                System.out.println("Entrada inválida, digite um número.");
                scan.next();
                System.out.print("Qual será o fator da multiplicação? ");
            }
        }
        System.out.println("A matriz informada foi:");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print("["+matriz[l][c]+"]\t");
            }
            System.out.println();
        }
        
        System.out.println("A matriz informada multiplicada pelo fator "+fator+" resulta em:");
        for (int l = 0; l < matrizProduto.length; l++) {
            for (int c = 0; c < matrizProduto[0].length; c++) {
                matrizProduto[l][c] = matriz[l][c]*fator;
                System.out.print("["+matrizProduto[l][c]+"]\t");
            }
            System.out.println();
        }
    }
}
