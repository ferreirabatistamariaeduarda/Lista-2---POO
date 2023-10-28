import java.util.Scanner;

public class Questão_3 {
    public static void main(String[] args) {
        
        float tempo_gasto;
        float vel_media;
        float distancia;
        float litros_usados;

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o tempo gasto na viagem(em minutos): ");
        tempo_gasto = ler.nextFloat();
        System.out.println("Digite a velocidade média usada: ");
        vel_media = ler.nextFloat();

        distancia = tempo_gasto * vel_media;
        litros_usados = distancia/12;

        System.out.println("Tempo gasto na viagem: " + tempo_gasto);
        System.out.println("Velocidade média: " + vel_media);
        System.out.println("Distancia percorrida: " + distancia);
        System.out.println("Litros usados na viagem: " + litros_usados);
        ler.close();
        

    }
}
