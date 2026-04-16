package Aula05_1;

public class Exercicio6 {
    public static void main(String[] args) throws InterruptedException {
        int tamanhoBalao=1;
        String balao="🟧";
        
        while (tamanhoBalao<=7) {
            for (int c=0; c<50; c++) {
                System.out.println("");
            }
            
            for (int a=0; a<tamanhoBalao; a++) {
                for (int b=0; b<tamanhoBalao; b++) {
                    System.out.print(balao);
                }
                System.out.println("");
            }
            tamanhoBalao++;
            Thread.sleep(1000);
            for (int c=0; c<50; c++) {
                System.out.println("");
            }
            
        }
        for (int e=0; e<50; e++) {
            System.out.println("");
        }
        System.out.println("      🟧      🟧    🟧");
        System.out.println("🟧         🟧         🟧");
        System.out.println(" 🟧     🟧         🟧   🟧");
        System.out.println("             🟧      🟧");
        System.out.println("   🟧    🟧           ");
        System.out.println("        🟧        🟧  ");
        System.out.println("🟧     🟧           🟧");
        
        
    }
}
