import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu valor");

        double preco = leitor.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);


    }
}