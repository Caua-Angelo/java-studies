import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int soma = 0;

        while(x != 0 ){
            soma += x;
            x = leitor.nextInt();
        }
        System.out.println(soma);
        leitor.close();
    }
}