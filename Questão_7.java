import java.util.Scanner;

public class Questão_7 {

    public static void main(String[] args) {

        int cem = 0;
        int cinquenta = 0;
        int dez = 0;
        int cinco = 0;
        int um = 0;
        int saque;
        int t;

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor a ser sacado (inteiro): ");
        saque = ler.nextInt();

        t = saque;

        if (t >= 100) {
            cem = t / 100;
            t %= 100;
        }
        if (t >= 50) {
            cinquenta = t / 50;
            t %= 50;
        }
        if (t >= 10) {
            dez = t / 10;
            t %= 10;
        }
        if (t >= 5) {
            cinco = t / 5;
            t %= 5;
        }
        if (t >= 1) {
            um = t / 1;
        }

        System.out.println("O saque será feito com as seguintes notas: ");
        System.out.printf("%d notas de 100\n", cem);
        System.out.printf("%d notas de 50\n", cinquenta);
        System.out.printf("%d notas de 10\n", dez);
        System.out.printf("%d notas de 5\n", cinco);
        System.out.printf("%d notas de 1\n", um);

        ler.close();
    }
}
