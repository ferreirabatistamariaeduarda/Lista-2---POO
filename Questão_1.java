import java.util.Scanner;

public class Questão_1 {
    public static void main(String[] args) {

        int valorUsuario;
        int mult = 0;
        int resultado = 0;


        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        valorUsuario = ler.nextInt();
        
        for(int x = 0; x < 10; x++){
            resultado = valorUsuario * ++mult;
            System.out.println(valorUsuario + " x " + mult + "=" + resultado);

        }
        ler.close();
    }

}