import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);

        System.out.println("Qual o valor do seu salário?");

        Double imposto = null;
        Double salario = Leitor.nextDouble();

        if (salario > 0 && salario <= 2000) {
            System.out.println("Isento");
        }
        else if (salario > 2000 && salario < 3000) {
            imposto = salario * 8.0 / 100;
        }
        else if (salario > 3000 && salario < 4500) {
            imposto = salario * 18.0 /100;
        }

        System.out.printf("%d R$ %.2f%n",imposto);
    }

}