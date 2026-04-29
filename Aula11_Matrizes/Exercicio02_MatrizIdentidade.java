package Aula11_Matrizes;

import java.util.Scanner;

public class Exercicio02_MatrizIdentidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean identidade = true;
        
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
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
        
        System.out.println("A matriz informada foi a seguinte:");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("["+matriz[l][c]+"]\t");
                if (l==c && matriz[l][c]!=1) identidade = false;
                if (l!=c && matriz[l][c]!=0) identidade = false;
            }
            System.out.println();
        }
        if (identidade==true) {
            System.out.println("A matriz informada é uma matriz identidade.");
        } else {
            System.out.println("A matriz informada não é uma matriz identidade.");
        }
    }
}
