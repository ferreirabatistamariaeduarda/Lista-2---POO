import java.util.Scanner;

public class Questão_9 {

    public static void main(String[] args) {

        int d1;
        int d2;
        int d3;

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um valor inteiro de três dígitos: ");
        int numero = ler.nextInt();

        if (numero >= 100 && numero <= 999) {
                d1 = numero % 10;
                d2 = (numero / 10) % 10;
                d3 = numero / 100;

            int invertido = d1 * 100 + d2 * 10 + d3;

            System.out.println("O valor original é: " + numero);
            System.out.println("O valor invertido é: " + invertido);
        } else {
            System.out.println("O número informado não possui 3 dígitos.");
        }

        ler.close();
    }
}


