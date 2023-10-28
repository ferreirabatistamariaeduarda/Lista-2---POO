import java.util.Scanner;

public class Questão_8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Entrada: leia a diária normal
        System.out.print("Informe o valor da diária normal: ");
        double diariaNormal = ler.nextDouble();

        
        double taxaPromocao = 0.22;
        double ocupacaoSemPromocao = 0.40;
        double ocupacaoComPromocao = 0.70;
        double diariaPromocao = diariaNormal - (diariaNormal * taxaPromocao);
        double arrecadadoSemPromocao = diariaNormal * ocupacaoSemPromocao * 30;
        double arrecadadoComPromocao = diariaPromocao * ocupacaoComPromocao * 30;
        double lucroOuPrejuizo = arrecadadoComPromocao - arrecadadoSemPromocao;

        System.out.printf("a) Valor da diária no período da promoção: R$ %.2f%n", diariaPromocao);
        System.out.printf("b) Valor médio arrecadado sem a promoção, durante um mês: R$ %.2f%n", arrecadadoSemPromocao);
        System.out.printf("c) Valor médio arrecadado com a promoção, durante um mês: R$ %.2f%n", arrecadadoComPromocao);
        System.out.printf("d) Lucro ou prejuízo mensal com a promoção: R$ %.2f%n", lucroOuPrejuizo);

        ler.close();
    }
}
