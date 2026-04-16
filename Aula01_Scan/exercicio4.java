package projeto_java_1;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite uma distância em metros: ");
        double distancia = scan.nextDouble();
        
        System.out.println( distancia + " metros são equivalentes a " + distancia/1000 + " quilômetros e " + distancia*100 + " centímetros.");
        
    }
}
