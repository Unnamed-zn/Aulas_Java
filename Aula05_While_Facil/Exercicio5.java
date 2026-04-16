package Aula05_1;

public class Exercicio5 {
    public static void main(String[] args) {
        int download=0;
        
        System.out.println("Estamos fazendo o download do seu arquivo, aguarde.");
        while (download<=100) {
            System.out.println("Progresso do download: "+download+"%");
            if (download==100) {
                System.out.println("Download concluído.");
            }
            download+=30;
        }
    }
}
