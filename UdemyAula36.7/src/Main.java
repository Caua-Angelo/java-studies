import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);

        double X, Y;

        System.out.println("Digite o X e o Y");

        X = Leitura.nextDouble();
        Y = Leitura.nextDouble();

        if (X == 0 && Y == 0)
            System.out.println("Origem");

        else if (X > 0 && Y > 0)
            System.out.println("Q1");

        else if (X < 0 && Y > 0)
            System.out.println("Q2");

        else if (X <= -1 && Y <= -1)
            System.out.println("Q3");

        else if (X > 0 && Y < 0)
            System.out.println("Q4");


    }
}