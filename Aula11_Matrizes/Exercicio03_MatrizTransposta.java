package Aula11_Matrizes;

//import java.util.Random;
import java.util.Scanner;

public class Exercicio03_MatrizTransposta {
    public static void main(String[] args) {
        //Random rd = new Random();
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matrizTransposta = new int[matriz.length][matriz[0].length];
        
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
        System.out.println("A matriz informada foi:");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print("["+matriz[l][c]+"]\t");
            }
            System.out.println();
        }
        
        System.out.println("A matriz transposta da matriz informada é:");
        for (int l = 0; l < matrizTransposta.length; l++) {
            for (int c = 0; c < matrizTransposta[0].length; c++) {
                matrizTransposta[l][c] = matriz[c][l];
                System.out.print("["+matrizTransposta[l][c]+"]\t");
            }
            System.out.println();
        }
    }
}
