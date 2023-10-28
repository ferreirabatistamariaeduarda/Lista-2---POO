import java.util.Scanner;

public class Questão_4 {
    public static void main(String[] args) {
        
        float cotDolar;
        float valorDolar;
        float valorReal;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a atual cotação do dólar: ");
        cotDolar = ler.nextFloat();
        System.out.println("Digite um valor em Dólar: ");
        valorDolar = ler.nextFloat();

        valorReal = cotDolar/valorDolar;

        System.out.println("Convertido para Real : R$" + valorReal);
        ler.close();

    }
}
