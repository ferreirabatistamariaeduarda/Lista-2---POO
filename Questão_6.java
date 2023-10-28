import java.util.Scanner;

public class Questão_6 {
    public static void main(String[] args) {

        int hora;
        int minutos;
        int segundos;
        int duracaoEvento;
        
        System.out.println("Transformador de evento expresso em segundos");
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o tempo de duração do evento em segundos: ");
        duracaoEvento = ler.nextInt();
        
        hora = duracaoEvento/3600;
        minutos = (duracaoEvento/60) % 60;
        segundos = duracaoEvento % 60;

        System.out.printf("Duração do evento: %02d:%02d:%02d\n\n", hora, minutos, segundos);

        ler.close();


    }
}
