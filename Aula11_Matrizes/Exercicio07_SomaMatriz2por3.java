package Aula11_Matrizes;

//import java.util.Random;
import java.util.Scanner;

public class Exercicio07_SomaMatriz2por3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        //Random rd = new Random();
        
        int soma = 0;
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
                soma+=matriz[l][c];
            }
        }
        
        System.out.println("A matriz informada foi:");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print("["+matriz[l][c]+"]\t");
            }
            System.out.println();
        }
        System.out.println("A soma dos elementos da matriz é "+soma);
    }
}
