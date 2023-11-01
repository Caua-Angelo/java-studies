
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);

        System.out.println("Quantos números você deseja somar?");

        int Quantidade = Leitor.nextInt();
        int Soma = 0;

        System.out.println("Digite " + Quantidade + " Números :)");

        for(int i=0; i<Quantidade; i++) {

            int Valor_atual = Leitor.nextInt();
            Soma += Valor_atual;

        }
        System.out.println("A soma dos numeros é: " +Soma);

        Leitor.close();
    }
}