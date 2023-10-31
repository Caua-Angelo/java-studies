import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int valor1, valor2;
        System.out.println("Digite dois valores");
        valor1 = leitor.nextInt();
        valor2 = leitor.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0 )
            System.out.println("São multiplos");
        else{
            System.out.println("Não são multiplos");
        }
        leitor.close();
    }

}