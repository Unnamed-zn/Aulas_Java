package Aula05_1;

public class Exercicio3 {
    public static void main(String[] args) {
        int andar=0;
        
        while (andar<=5) {
            System.out.println("Andar: "+andar);
            if (andar==5) {
                System.out.println("Chegamos ao topo!");
            }
            andar++;
        }
    }
}