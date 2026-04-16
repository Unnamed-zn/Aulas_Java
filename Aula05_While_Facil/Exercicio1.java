package Aula05_1;

public class Exercicio1 {
    public static void main(String[] args) {
        int contador=10;
        
        while (contador>=0) {
            System.out.println("Preparando decolagem... "+contador);
            if (contador==0) {
                System.out.println("Decolando!");
                }
            contador-=2;
        }
        
    }
}
