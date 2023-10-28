import java.util.Scanner;

public class Questão_2 {
    public static void main(String[] args) {
        
        int F;
        int C;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma Temperatura em graus Celsius: ");
        C = ler.nextInt();

        F = (9 * C + 160) / 5;

        System.out.println("A temperatura convertida para graus Fahreinheit é: " + F +"ºF");

        ler.close();

    }
}
