import java.util.Scanner;

public class Questão_5 {
    public static void main(String[] args) {

        int anos;
        int meses;
        int dias;
        int total_dias;
        int transformar_ano_dia;
        int transformar_mes_dia;

        System.out.println("Informe sua idade em anos, meses e dias.");
        Scanner ler = new Scanner(System.in);

        System.out.println("Anos: ");
        anos = ler.nextInt();
        System.out.println("Meses: ");
        meses = ler.nextInt();
        System.out.println("dias: ");
        dias = ler.nextInt();

        transformar_ano_dia = anos * 365;
        transformar_mes_dia = meses * 30;

        total_dias = transformar_ano_dia + transformar_mes_dia + dias;

        System.out.println("Sua idade em dias é: " + total_dias);
        ler.close();
        
    }   
}
