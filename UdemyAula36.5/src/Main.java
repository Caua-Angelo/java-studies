import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        double cachorro = 4.00;
        double x_Salada = 4.50;
        double x_Bacon = 5.00;
        double torrada_Simples = 2.00;
        double refrigerante = 1.50;
        double total = 0.0;

        int codigo;
        int quantidade;
        System.out.println("Os produtos disponíveis no momento são");
        System.out.println("1  Cachorro-Quente R$ 4,00");
        System.out.println("2  x-Salada R$ 4,50");
        System.out.println("3  x-bacon R$5,00");
        System.out.println("4  torrada simples R$2.00");
        System.out.println("5  refrigerante R$1,50");

        System.out.println("Digite o código do produto e a quantidade desejada");

        codigo = Leitor.nextInt();
        quantidade = Leitor.nextInt();

        if (codigo == 1) {
            total = (cachorro * quantidade);
        } else if (codigo == 2) {
            total = (x_Salada * quantidade);
        } else if (codigo == 3) {
            total = (x_Bacon * quantidade);
        } else if (codigo == 4) {
            total = (torrada_Simples * quantidade);
        } else if (codigo == 5) {
            total = (refrigerante * quantidade);
        }
        System.out.printf("Total: R$%.2f ", total);
    }
}
