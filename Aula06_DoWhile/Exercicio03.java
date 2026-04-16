package Aula06;

public class Exercicio03 {
    public static void main(String[] args) throws InterruptedException {
        int contador=10;
        
        do {
            System.out.println(contador);
            Thread.sleep(1000);
            contador--;
        } while (contador>=1);
    }
}
