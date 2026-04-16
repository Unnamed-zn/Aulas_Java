package Aula05_1;

public class Exercicio4 {
    public static void main(String[] args) {
        int bateria=100;
        
        while (bateria>0) {
            bateria-=13;
            
            System.out.println("Computador trabalhando exaustivamente, bateria restante: "+(Math.max(0,bateria))+"%");
            if (bateria==0) {
                System.out.println("Bateria esgotada, desligando o computador.");
            }
        }
    }
}
